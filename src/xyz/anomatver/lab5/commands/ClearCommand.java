package xyz.anomatver.lab5.commands;

import xyz.anomatver.lab5.CollectionManager;
import xyz.anomatver.lab5.IoManager;

/**
 * Команда для очищения коллекции.
 *
 * @author Матвей
 *
 */

public class ClearCommand extends Command{


    @Override
    public String getDescription() {
        return "очищает коллекцию.";
    }

    @Override
    public void run(CollectionManager collectionManager, IoManager ioManager) {
        collectionManager.clear();
    }

}
