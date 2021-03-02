package xyz.anomatver.lab5.commands;

import xyz.anomatver.lab5.CollectionManager;
import xyz.anomatver.lab5.IoManager;

/**
 * Команда для удаления элемента коллекции, находящегося на заданной позиции (отсчет от единицы).
 *
 * @author Матвей
 *
 */

public class RemoveAtCommand extends Command {

    @Override
    public String getDescription() {
        return "удаляет элемент, содержащийся в указанной позиции.";
    }

    @Override
    public void run(CollectionManager collectionManager, IoManager ioManager) {
        collectionManager.removeAt(Integer.parseInt(args)-1);
    }


}