package xyz.anomatver.lab5.commands;

import xyz.anomatver.lab5.CollectionManager;
import xyz.anomatver.lab5.IoManager;

import java.util.Map;
/**
 * Команда для вывода справки.
 *
 * @author Матвей
 *
 */
public class HelpCommand extends Command{

    @Override
    public String getDescription() {
        return "возвращает список команд. Неожиданно?";
    }

    @Override
    public void run(CollectionManager collectionManager, IoManager ioManager) {
        for (Map.Entry<String, Command> commandEntry: CommandsList.commands.entrySet()) {
            System.out.println(commandEntry.getKey() + " — "+commandEntry.getValue().getDescription());
        }
    }



}
