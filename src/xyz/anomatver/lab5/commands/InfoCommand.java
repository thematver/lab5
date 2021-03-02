package xyz.anomatver.lab5.commands;

import xyz.anomatver.lab5.CollectionManager;
import xyz.anomatver.lab5.IoManager;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
/**
 * Команда для вывода информации о коллекции
 *
 * @author Матвей
 *
 */
public class InfoCommand extends Command{
    @Override
    public String getDescription() {
        return "выводит в поток информацию о коллекции.";
    }

    @Override
    public void run(CollectionManager collectionManager, IoManager ioManager) {
        try {
        String fileName = System.getenv("LAB5_FILE_PATH");
        File file = new File(fileName);
            System.out.println("Тип коллекции: " + collectionManager.getCollection().getClass().toString() + "\nДата инициализации: "+ Files.readAttributes(file.toPath(), BasicFileAttributes.class).creationTime()+"\nКоличество элементов: "+collectionManager.getCollection().size()) ;
        } catch (IOException e) {
            System.out.println("Коллекция не найдена или неизвестны аттрибуты коллекции");
        }
    }


}
