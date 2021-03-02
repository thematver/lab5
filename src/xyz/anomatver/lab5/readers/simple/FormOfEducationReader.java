package xyz.anomatver.lab5.readers.simple;

import xyz.anomatver.lab5.models.FormOfEducation;
import xyz.anomatver.lab5.models.Semester;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Класс для считывания формы обучения.
 *
 * @author Матвей
 *
 */
public class FormOfEducationReader extends SimpleReader<FormOfEducation>
{
    public FormOfEducationReader(Scanner scanner) {
        super(scanner);
    }

    @Override
    protected FormOfEducation readAttempt() {
        for (FormOfEducation s:
                FormOfEducation.values()) {
            System.out.printf("%n%5s", s);
        }
        scanner.nextLine();
        System.out.println();

        String formOfEducationString = scanner.nextLine();
        FormOfEducation formOfEducation;
try {
  formOfEducation = FormOfEducation.valueOf(formOfEducationString);
}
catch (IllegalArgumentException e) {

    throw new InputMismatchException();
}

return formOfEducation;
    }
}
