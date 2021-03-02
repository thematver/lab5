package xyz.anomatver.lab5.commands;

import xyz.anomatver.lab5.CollectionManager;
import xyz.anomatver.lab5.IoManager;
/**
 * Команда для вывода коллекции.
 *
 * @author Матвей
 *
 */
public class ShowCommand extends Command{
    @Override
    public String getDescription() {
        return "выводит в терминал всю коллекцию.";
    }

    @Override
    public void run(CollectionManager collectionManager, IoManager ioManager){
        collectionManager.show();
    }


}
