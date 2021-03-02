package xyz.anomatver.lab5.commands;

import xyz.anomatver.lab5.CollectionManager;
import xyz.anomatver.lab5.IoManager;

/**
 * Команда для вывода на экран всех элементов, у которых имя содержит данную подстроку.
 *
 * @author Матвей
 *
 */

public class FilterContainsNameCommand extends Command {
    @Override
    public String getDescription() {
        return "выводит на экран все элементы коллекции, у которых имя содержит указанную подстроку";
    }

    @Override
    public void run(CollectionManager collectionManager, IoManager ioManager) {
        collectionManager.filterContainsName(args);
    }


}
