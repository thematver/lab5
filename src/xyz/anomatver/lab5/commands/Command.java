package xyz.anomatver.lab5.commands;

import xyz.anomatver.lab5.CollectionManager;
import xyz.anomatver.lab5.ExitException;
import xyz.anomatver.lab5.IoManager;

/**
 * Абстрактный класс, объявляющий необходимые для команд методы.
 *
 * @author Матвей
 *
 */
public abstract class Command {

    String args;

    public String getArgs() {
        return args;
    }

    public Command setArgs(String args) {
       this.args = args;
       return this;
    }

    abstract String getDescription();


    public abstract void run(CollectionManager collectionManager, IoManager ioManager) throws ExitException;
}
