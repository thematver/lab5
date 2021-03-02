package xyz.anomatver.lab5.commands;

import xyz.anomatver.lab5.CollectionManager;
import xyz.anomatver.lab5.IoManager;

/**
 * Команда для сохранения коллекции.
 *
 * @author Матвей
 *
 */
public class SaveCommand extends Command{
    @Override
    public String getDescription() {
        return "сохраняет коллекцию в файл.";
    }

    @Override
    public void run(CollectionManager collectionManager, IoManager ioManager) {
            ioManager.save(collectionManager);

    }

}
