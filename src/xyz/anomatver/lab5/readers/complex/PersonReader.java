package xyz.anomatver.lab5.readers.complex;

import xyz.anomatver.lab5.models.Person;
import xyz.anomatver.lab5.readers.simple.DateReader;
import xyz.anomatver.lab5.readers.simple.LongReader;
import xyz.anomatver.lab5.readers.simple.StringReader;

import java.util.Date;
import java.util.Scanner;

/**
 * Класс для считывания старосты группы.
 *
 * @author Матвей
 *
 */
public class PersonReader extends ComplexReader<Person> {

    public PersonReader(Scanner scanner) {
        super(scanner);
    }

    @Override
    protected Person readAttempt() {
        String name = new StringReader(scanner).setNullable(false).read("Введи имя старосты: ");
        Date date = new DateReader(scanner).setNullable(false).read("Введите дату рождения старосты: ");
        Long height = new LongReader(scanner).setNullable(false).setPredicate(x -> x>0).read("Введите рост старосты: ");
        Long weight = new LongReader(scanner).setNullable(false).setPredicate(x -> x>0).read("Введите вес старосты: ");
        scanner.nextLine();
        System.out.println("Ввод старосты успешно завершен;");
        return new Person(name, date, height, weight);
    }
}
