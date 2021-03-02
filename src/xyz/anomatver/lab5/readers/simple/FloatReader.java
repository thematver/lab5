package xyz.anomatver.lab5.readers.simple;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Класс для считывания чисел с плавающей запятой.
 *
 * @author Матвей
 *
 */
public class FloatReader extends SimpleReader<Float> {


    public FloatReader(Scanner scanner) {
        super(scanner);
    }

    @Override
    public SimpleReader<Float> setNullable(boolean isNullable) {
        this.isNullable = isNullable;
        return this;
    }

    @Override
    protected Float readAttempt() {

        value =  scanner.nextFloat();
        if (!check()) {
            throw new InputMismatchException();
        }
        return value;
    }


}

