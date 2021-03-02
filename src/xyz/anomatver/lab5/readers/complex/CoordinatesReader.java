package xyz.anomatver.lab5.readers.complex;

import xyz.anomatver.lab5.models.Coordinates;
import xyz.anomatver.lab5.readers.simple.FloatReader;
import xyz.anomatver.lab5.readers.simple.LongReader;

import java.util.Scanner;

/**
 * Класс для считывания координат.
 *
 * @author Матвей
 *
 */
public class CoordinatesReader  extends ComplexReader<Coordinates> {

    public CoordinatesReader(Scanner scanner) {
        super(scanner);
    }

    @Override
    protected Coordinates readAttempt() {
        System.out.println("Начнем ввод координат.");
        float x = new FloatReader(scanner).setNullable(false).read("Введите координату x: ");
        Long y = new LongReader(scanner).setNullable(false).setPredicate(a -> a>-97).read("Введите координату y: ");
        System.out.println("Ввод координат успешно завершен");
        return new Coordinates(x, y);
    }
}
