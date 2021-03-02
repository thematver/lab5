package xyz.anomatver.lab5.readers.simple;


import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Predicate;


/**
 * Абстрактный класс для простых ридеров данных; содержит в себе повторяющийся код, позволяющий считать примитив.
 *
 * @author Матвей
 *
 */
public abstract class SimpleReader<T> {

    protected T value = null;
    protected boolean isNullable;
    protected Scanner scanner;
    Predicate<T> predicate = x -> true;

    public SimpleReader<T> setNullable(boolean isNullable) {
        this.isNullable = isNullable;
        return this;
    }


    public SimpleReader(Scanner scanner) {
        this.scanner = scanner;
    };

    protected boolean check() {
        return predicate.test(value) && checkForNull();
    }
    //Is nullable
    // 1 0
    // 1 1
    // 0 1
    private boolean checkForNull() {
        return isNullable || value != null;
    }

    public SimpleReader<T> setPredicate(Predicate<T> predicate) {
        this.predicate = predicate;
        return this;
    }

    protected abstract T readAttempt();

    public T read(String welcomingText) {
        System.out.print(welcomingText);
        while (true) {
            try {
                value = readAttempt();
            } catch (InputMismatchException e) {
                System.out.println("Неправильный ввод! Попробуй еще раз.");
                scanner.nextLine();
                continue;
            }
            break;
        }
        return value;
    }
    }

