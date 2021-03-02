package xyz.anomatver.lab5.readers.simple;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Класс для считывания тридцатидвухбитных чисел.
 *
 * @author Матвей
 *
 */

public class IntReader extends SimpleReader<Integer> {


    public IntReader(Scanner scanner) {
        super(scanner);
    }

    @Override
    public SimpleReader<Integer> setNullable(boolean isNullable) {
        this.isNullable = isNullable;
        return this;
    }

    @Override
    protected Integer readAttempt() {
        value = scanner.nextInt();
        if (!check()) {
            throw new InputMismatchException();
        }
        return value;

    }


}

