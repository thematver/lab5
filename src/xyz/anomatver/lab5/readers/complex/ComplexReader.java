package xyz.anomatver.lab5.readers.complex;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Класс для считывания сложных объектов.
 *
 * @author Матвей
 *
 */
public abstract class ComplexReader<T> {
    protected boolean isNullable;//TODO (!!!!!!!)  IT CAN BE NOT NULL
    protected Scanner scanner;
    T value = null;

    public ComplexReader<T> setNullable(boolean isNullable) {
        this.isNullable = isNullable;
        return this;
    }



    protected ComplexReader(Scanner scanner) {
        this.scanner = scanner;
    }
    protected abstract T readAttempt();
    protected boolean checkForNull() {
        return !isNullable && value == null;
    }

    public T read(String welcomingText) {
        System.out.println(welcomingText);
        while (true) {
            try {
                value = readAttempt();
            } catch (InputMismatchException e) {
                System.out.println("Неправильный ввод! Попробуй еще раз.");
                continue;
            }
            break;
        }

        return value;
    }
}


