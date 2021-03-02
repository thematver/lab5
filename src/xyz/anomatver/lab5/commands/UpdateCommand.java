package xyz.anomatver.lab5.commands;

import xyz.anomatver.lab5.CollectionManager;
import xyz.anomatver.lab5.IoManager;
import xyz.anomatver.lab5.models.StudyGroup;
import xyz.anomatver.lab5.readers.complex.StudyGroupReader;

/**
 * Команда для обновления коллекции.
 *
 * @author Матвей
 *
 */

public class UpdateCommand extends Command{

    @Override
    public String getDescription() {
        return "обновляет коллекцию заданным элементом.";
    }

    @Override
    public void run(CollectionManager collectionManager, IoManager ioManager) {
        StudyGroup studyGroup = new StudyGroupReader(ioManager.getScanner()).read("Введите учебную группу: ");
        collectionManager.update(Integer.parseInt(args)-1, studyGroup);
    }


    }

