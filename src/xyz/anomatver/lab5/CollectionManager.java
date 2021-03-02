package xyz.anomatver.lab5;

import xyz.anomatver.lab5.commands.Command;
import xyz.anomatver.lab5.models.Person;
import xyz.anomatver.lab5.models.StudyGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;

/**
 * Менеджер коллекции управляет коллекцией.
 *
 * @author Матвей
 *
 */

public class CollectionManager {
    static final Logger logger = Logger.getLogger("CollectionManager");
    private final ArrayList<StudyGroup> collection = new ArrayList<>();

    public List<StudyGroup> getCollection() {
        return collection;
    }

    public void add(StudyGroup group) {
        collection.add(group);
    }

    public void addAll(List<StudyGroup> groups) {
        collection.addAll(groups);
    }

    public void update(int id, StudyGroup group) {
        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i).getId() == id) {
                remove(id);
                collection.add(i, group);
            }
        }

    }

    public void remove(int id) {
        collection.removeIf(studyGroup -> studyGroup.getId() == id);
    }

    public void clear() {
        collection.clear();
    }


    public void removeAt(int index) {
        collection.remove(index);
    }

    public void removeFirst() {
        collection.remove(0);
    }

    public void shuffle() {
        Collections.shuffle(collection);
    }

    public void show() {
        for (StudyGroup group : collection) {
            System.out.println(group);
        }
    }

    public void filterContainsName(String name) {
        for (StudyGroup group : collection) {
            if (group.getName().contains(name))
                System.out.println(group);
        }
    }

    public void filterGreaterThanGroupAdmin(Person admin) {
        for (StudyGroup group : collection) {
            if (group.getGroupAdmin().compareTo(admin) < 0)
                System.out.println(group);
        }
    }

    public void printFieldAscendingSemesterEnum() {
        collection.stream().sorted(Comparator.comparing(StudyGroup::getSemesterEnum)).forEach(System.out::println);
    }

}




