package xyz.anomatver.lab5.commands;

import xyz.anomatver.lab5.CollectionManager;
import xyz.anomatver.lab5.IoManager;


/**
 * Команда для перетасовки коллекции.
 *
 * @author Матвей
 *
 */
public class ShuffleCommand extends Command{
    @Override
    public String getDescription() {
        return "перемешивает коллекцию";
    }

    @Override
    public void run(CollectionManager collectionManager, IoManager ioManager){
        collectionManager.shuffle();
    }


}
