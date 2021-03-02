package xyz.anomatver.lab5.readers.simple;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Класс для считывания шестидесятичетырехбитных чисел.
 *
 * @author Матвей
 *
 */
public class LongReader extends SimpleReader<Long> {


    public LongReader(Scanner scanner) {
        super(scanner);
    }

    @Override
    protected Long readAttempt() {
        value = scanner.nextLong();

        if (!check()) {
            throw new InputMismatchException();
        }
        return value;
    }


    @Override
    public SimpleReader<Long> setNullable(boolean isNullable) {
        this.isNullable = isNullable;
        return this;
    }






}

