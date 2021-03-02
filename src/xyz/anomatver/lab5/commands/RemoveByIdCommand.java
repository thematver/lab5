package xyz.anomatver.lab5.commands;

import xyz.anomatver.lab5.CollectionManager;
import xyz.anomatver.lab5.IoManager;
/**
 * Команда для удаления элемента коллекции по его id.
 *
 * @author Матвей
 *
 */
public class RemoveByIdCommand extends Command {

    @Override
    public String getDescription() {
        return "удаляет элемент с указанным id.";
    }

    @Override
    public void run(CollectionManager collectionManager, IoManager ioManager) {
        try {
            collectionManager.remove(Integer.parseInt(args));
        }
        catch (NumberFormatException e) {
            System.out.println("Id должен быть типа int");
        }
    }



}
