package xyz.anomatver.lab5.commands;

import xyz.anomatver.lab5.CollectionManager;
import xyz.anomatver.lab5.IoManager;

/**
 * Команда для вывода элементов коллекции по убыванию значения поля "семестр".
 *
 * @author Матвей
 *
 */

public class PrintFieldAscendingSemesterEnumCommand extends Command {

    @Override
    public String getDescription() {
        return "выводит значения поля semesterEnum всех элементов в порядке возрастания";
    }

    @Override
    public void run(CollectionManager collectionManager, IoManager ioManager) {
        collectionManager.printFieldAscendingSemesterEnum();
    }

}
