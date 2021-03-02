package xyz.anomatver.lab5.models;

import java.time.*;
/**
 * Модель группы - главного элемента коллекции.
 *
 * @author Матвей
 *
 */
public final class StudyGroup {

    private int id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.ZonedDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private int studentsCount; //Значение поля должно быть больше 0
    private FormOfEducation formOfEducation; //Поле может быть null
    private Semester semesterEnum; //Поле не может быть null
    private Person groupAdmin; //Поле не может быть null

    public StudyGroup(int id, String name, Coordinates coordinates, ZonedDateTime creationDate, int studentsCount, FormOfEducation formOfEducation, Semester semesterEnum, Person groupAdmin) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.studentsCount = studentsCount;
        this.formOfEducation = formOfEducation;
        this.semesterEnum = semesterEnum;
        this.groupAdmin = groupAdmin;
    }




    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public ZonedDateTime getCreationDate() {
        return creationDate;
    }

    public int getStudentsCount() {
        return studentsCount;
    }

    public FormOfEducation getFormOfEducation() {
        return formOfEducation;
    }

    public Semester getSemesterEnum() {
        return semesterEnum;
    }

    public Person getGroupAdmin() {
        return groupAdmin;
    }





    public StudyGroup setId(int id) {
        this.id = id;
        return this;
    }

    public StudyGroup setName(String name) {
        this.name = name;
        return this;
    }

    public StudyGroup setCreationTime(ZonedDateTime creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    public StudyGroup setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    public String toString() {
        return String.format("ID группы: %d, имя: %s, координаты: %s, дата создания: %s, количество студентов: %d, форма обучения: %s, семестр: %s, администратор группы: %s", getId(), getName(), getCoordinates(), getCreationDate(), getStudentsCount(), getFormOfEducation(), getSemesterEnum(), getGroupAdmin());
    }

}



