package xyz.anomatver.lab5;

import xyz.anomatver.lab5.commands.Command;
import xyz.anomatver.lab5.commands.ExecuteCommand;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.logging.Logger;

/**
 * Главный класс — нужен для связи всех пакетов в одно.
 *
 * @author Матвей
 *
 */

public class Client {

    private static final Logger logger = Logger.getLogger("Client");
    private static final CollectionManager collectionManager = new CollectionManager();
    private static IoManager ioManager;

    public static void main(String[] args) {
        logger.info("Начало программы. Переменная окружения \"LAB5_FILE_PATH\"=" + System.getenv("LAB5_FILE_PATH"));
        try {
            ioManager = new IoManager(collectionManager);
        } catch (IOException e) {
            logger.warning("Файл не найден!");
        }


        while (true) {
            Command command;
            try {
                String commandString = ioManager.readCommand();
                command = Interpreter.parse(commandString);
                if (command.getClass().equals(ExecuteCommand.class)) {
                        ioManager.setReadFromFile(command.getArgs());
                        logger.info("Переключаемся на ввод с файла.");
                        continue;
                    }
                command.run(collectionManager, ioManager);
            } catch (NoSuchElementException e) {
                continue;
            }
            catch (ExitException e) {
                break;
            }
        catch (FileNotFoundException e) {
            logger.warning("Файл для исполнения не найден.");
        }






        }
    }


}
