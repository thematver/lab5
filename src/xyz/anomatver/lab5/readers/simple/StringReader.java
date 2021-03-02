package xyz.anomatver.lab5.readers.simple;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Класс для считывания строк.
 *
 * @author Матвей
 *
 */

public class StringReader extends SimpleReader<String> {



    public StringReader(Scanner scanner) {
        super(scanner);
        isNullable = false;
        setPredicate(x -> !x.isEmpty());
    }

    @Override
    protected String readAttempt() {
       value = scanner.nextLine();
       if (!check()) {
           throw new InputMismatchException();
       }
       return value;
    }

    @Override
    public SimpleReader<String> setNullable(boolean isNullable) {
        this.isNullable = isNullable;
        return this;
    }



}

