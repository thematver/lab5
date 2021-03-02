package xyz.anomatver.lab5.commands;

import xyz.anomatver.lab5.CollectionManager;
import xyz.anomatver.lab5.IoManager;
/**
 * Команда выполнения команд из файла.
 *
 * @author Матвей
 *
 */
public class ExecuteCommand extends Command{
    @Override
    public String getDescription() {
        return "выполняет скрипт в файле.";
    }

    @Override
    public void run(CollectionManager collectionManager, IoManager ioManager) {
        //No need to override.
    }


}
