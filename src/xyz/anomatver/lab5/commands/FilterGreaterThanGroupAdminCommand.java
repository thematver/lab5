package xyz.anomatver.lab5.commands;

import xyz.anomatver.lab5.CollectionManager;
import xyz.anomatver.lab5.IoManager;
import xyz.anomatver.lab5.models.Person;
import xyz.anomatver.lab5.readers.complex.PersonReader;

/**
 * Команда для вывода на экран всех элементов, у которых рост администратора больше, чем у заданного.
 *
 * @author Матвей
 *
 */

public class FilterGreaterThanGroupAdminCommand extends Command {
    @Override
    public String getDescription() {
        return "выводит на экран все группы, у которых рост администратора больше, чем у заданного.";
    }

    @Override
    public void run(CollectionManager collectionManager, IoManager ioManager) {
        Person groupAdmin = new PersonReader(ioManager.getScanner()).read("Введите администратора группы: ");
        collectionManager.filterGreaterThanGroupAdmin(groupAdmin);
    }


}
