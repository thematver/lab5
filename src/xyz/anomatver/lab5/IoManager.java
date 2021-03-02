package xyz.anomatver.lab5;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import xyz.anomatver.lab5.commands.Command;
import xyz.anomatver.lab5.models.CreationDateDeserializer;
import xyz.anomatver.lab5.models.StudyGroup;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Менеджер входа-выхода создан для того, чтобы обрабатывать данные, входящие из файла или из консоли, а так же читать команды.
 *
 * @author Матвей
 *
 */
public class IoManager {
    private final String filePath;
    private final Logger logger = Logger.getLogger("IoManager");
    private FileReader reader;
    private  Scanner fileScanner;
    private  Scanner consoleScanner;
    private boolean readFromFile = false;

    public boolean isReadFromFile() {
        return readFromFile;
    }



    public IoManager(CollectionManager collectionManager) throws IOException {
        filePath = System.getenv("LAB5_FILE_PATH");
        reader = new FileReader(filePath);

        try (JsonReader jsonReader = new JsonReader(reader)) {
            GsonBuilder gsonBldr = new GsonBuilder();
            gsonBldr.registerTypeAdapter(ZonedDateTime.class, new CreationDateDeserializer());
            Type targetClassType = new TypeToken<ArrayList<StudyGroup>>() {
            }.getType();
            List<StudyGroup> sg = gsonBldr.create().fromJson(jsonReader, targetClassType);
            collectionManager.addAll(sg);
        } catch (IllegalStateException e) {
            logger.warning("Что-то не так с JSON. Работаю с чистого листа.");
        }

        catch (NullPointerException e) {
            logger.warning("Файл пуст или не существует.");
        }

        reader.close();
        fileScanner = new Scanner(reader);
        consoleScanner = new Scanner(System.in);
    }

    public IoManager setReadFromFile(String fileName) throws FileNotFoundException {
        try {

            reader = new FileReader(fileName);
            fileScanner = new Scanner(reader);
        }
        catch (NullPointerException e) {
            logger.warning("Ошибка! Файл не найден.");
        } catch (IOException e) {
            logger.warning("Ошибка");
        }
        this.readFromFile = true;
        return this;
    }
    public IoManager setReadFromFile() {
        this.readFromFile = false;
        return this;
    }

    public Scanner getScanner() {
        return readFromFile ? fileScanner : consoleScanner;
    }



    public void save(CollectionManager collectionManager) {
        try ( FileWriter writer = new FileWriter(filePath)){
            Gson gson = new Gson();
            writer.write(gson.toJson(collectionManager.getCollection()));
            writer.flush();
        }
        catch (IOException e) {
           logger.warning("Ошибка ввода-вывода. Что-то не так с файлом, куда нужно сохранять коллекцию.");
        }

    }

    public String readCommand() throws ExitException {
        String commandString = null;
        while (commandString == null) {
            try {
                commandString = getScanner().nextLine();
            } catch (NoSuchElementException e) {
                if (isReadFromFile()) {
                    setReadFromFile();
                    logger.info("Переключаемся на ввод с консоли.");
                }
                else {
                    throw new ExitException();
            }
        }

        }
        return commandString;
    }
}
