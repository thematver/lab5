package xyz.anomatver.lab5.commands;

import xyz.anomatver.lab5.CollectionManager;
import xyz.anomatver.lab5.IoManager;

/**
 * Команда для удаления первого элемента коллекции.
 *
 * @author Матвей
 *
 */

public class RemoveFirstCommand extends Command {

    @Override
    public String getDescription() {
        return "удаляет первый элемент коллекции.";
    }

    @Override
    public void run(CollectionManager collectionManager, IoManager ioManager) {
        collectionManager.removeFirst();
    }


}
