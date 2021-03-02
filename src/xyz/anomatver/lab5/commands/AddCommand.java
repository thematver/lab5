package xyz.anomatver.lab5.commands;

import xyz.anomatver.lab5.CollectionManager;
import xyz.anomatver.lab5.IoManager;
import xyz.anomatver.lab5.models.StudyGroup;
import xyz.anomatver.lab5.readers.complex.StudyGroupReader;

/**
 * Команда для добавления в коллекцию новых элементов.
 *
 * @author Матвей
 *
 */

public class AddCommand extends Command{
    @Override
    public String getDescription() {
        return "добавляет в конец коллекции указанный объект";
    }

    @Override
    public void run(CollectionManager collectionManager, IoManager ioManager) {
        StudyGroup studyGroup = new StudyGroupReader(ioManager.getScanner()).read("Введите учебную группу: ");
        collectionManager.add(studyGroup);
    }




}
