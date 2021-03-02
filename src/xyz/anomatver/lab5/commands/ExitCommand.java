package xyz.anomatver.lab5.commands;

import xyz.anomatver.lab5.CollectionManager;
import xyz.anomatver.lab5.ExitException;
import xyz.anomatver.lab5.IoManager;

/**
 * Команда для завершения программы.
 *
 * @author Матвей
 *
 */
public class ExitCommand extends Command{
    @Override
    public String getDescription() {
        return "завершает программу.";
    }

    @Override
    public void run(CollectionManager collectionManager, IoManager ioManager) throws ExitException {
        throw new ExitException();
    }




}
