package xyz.anomatver.lab5;


import xyz.anomatver.lab5.commands.*;
import java.util.*;
import java.util.logging.Logger;

/**
 * Интерпретатор служит для того, чтобы разбирать входную строку на объекты типа {@link Command}.
 *
 * @author Матвей
 *
 */

class Interpreter {

    private Interpreter() {
        super();
    }

    private static final Logger logger = Logger.getLogger("Interpreter");
    static final Map<String, Command> commands = CommandsList.commands;

    public static Command parse(String commandString)  {
        List<String> parsed = Arrays.asList(commandString.split(" ", 3));

        Command command = parsed.size() > 1 ? commands.get(parsed.get(0)).setArgs(parsed.get(1)) : commands.get(parsed.get(0));
         if (command == null) {
             logger.warning("Такой команды не существует! Попробуйте еще раз.");
             throw new NoSuchElementException();
         }
         else {
             return command;
         }

    }
}