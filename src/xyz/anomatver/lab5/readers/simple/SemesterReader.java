package xyz.anomatver.lab5.readers.simple;
import xyz.anomatver.lab5.models.Semester;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Класс для считывания значения семестра.
 *
 * @author Матвей
 *
 */
public class SemesterReader extends SimpleReader<Semester>
{
    public SemesterReader(Scanner scanner) {
        super(scanner);
    }

    @Override
    protected Semester readAttempt() {
        for (Semester s:
                Semester.values()) {
            System.out.printf("%n%5s", s);
        }
        System.out.println();



        String semesterString = scanner.nextLine();
        Semester semester;
try {
    semester =  Semester.valueOf(semesterString);
}
catch (IllegalArgumentException e) {
throw  new InputMismatchException();
}
return semester;
    }
}
