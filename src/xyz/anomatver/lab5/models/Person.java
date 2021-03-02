package xyz.anomatver.lab5.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
/**
 * Модель старосты.
 *
 * @author Матвей
 *
 */
public class Person implements Comparable<Person>, Serializable {

    private String name; //Поле не может быть null, Строка не может быть пустой
    private java.util.Date birthday; //Поле не может быть null
    private long height; //Значение поля должно быть больше 0
    private long weight; //Значение поля должно быть больше 0

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public long getHeight() {
        return height;
    }

    public long getWeight() {
        return weight;
    }



    public Person(String name, Date birthday, long height, long weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }


    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Person setBirthday(Date birthday) {
        this.birthday = birthday;
        return this;
    }

    public Person setHeight(long height) {
        this.height = height;
        return this;
    }

    public Person setWeight(long weight) {
        this.weight = weight;
        return this;
    }





    @Override
    public String toString() {
        return
                "Имя: '" + name +
                ", день рождения: " + birthday +
                ", рост: " + height +
                ", вес: " + weight;
    }






    @Override
    public int compareTo(Person o) {
        return Long.compare(o.getHeight(), this.getHeight());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return height == person.height && weight == person.weight && Objects.equals(name, person.name) && Objects.equals(birthday, person.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday, height, weight);
    }
}
