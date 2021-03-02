package xyz.anomatver.lab5.readers.simple;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Класс для считывания дат.
 *
 * @author Матвей
 *
 */

public class DateReader extends SimpleReader<Date> {
    public DateReader(Scanner scanner) {
        super(scanner);
    }

    @Override
    protected Date readAttempt() {
        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        try {
            value = formatter.parse(scanner.nextLine());
        } catch (ParseException e) {
            throw new InputMismatchException();
        }
        return value;
}}
