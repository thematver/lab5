package xyz.anomatver.lab5.readers.complex;

import xyz.anomatver.lab5.models.*;
import xyz.anomatver.lab5.readers.simple.FormOfEducationReader;
import xyz.anomatver.lab5.readers.simple.IntReader;
import xyz.anomatver.lab5.readers.simple.SemesterReader;
import xyz.anomatver.lab5.readers.simple.StringReader;

import java.time.ZonedDateTime;
import java.util.Scanner;

/**
 * Класс для считывания группы — главного объекта коллекции.
 *
 * @author Матвей
 *
 */

public class StudyGroupReader extends ComplexReader<StudyGroup> {

    public StudyGroupReader(Scanner scanner) {
        super(scanner);
    }

    @Override
    protected StudyGroup readAttempt() {
        String name = new StringReader(scanner).setNullable(false).read("Введите название группы: ");
        Coordinates coordinates = new CoordinatesReader(scanner).setNullable(false).read("Введите координаты: ");
        int studentsCount = new IntReader(scanner).setPredicate(x -> x>0).read("Введите количество студентов: ");
        FormOfEducation formOfEducation = new FormOfEducationReader(scanner).setNullable(true).read("Введите форму обучения из ниже предложенных вариантов: ");
        Semester semester = new SemesterReader(scanner).setNullable(false).read("Введите семестр из нижепредложенных вариантов: ");
        Person groupAdmin = new PersonReader(scanner).setNullable(false).read("Введите данные про старосту группы.");
        ZonedDateTime creationDate = ZonedDateTime.now();
        int id = hashCode();
        System.out.println("Ввод группы успешно завершен.");
       return new StudyGroup(id, name, coordinates, creationDate, studentsCount, formOfEducation, semester, groupAdmin);
    }
}
