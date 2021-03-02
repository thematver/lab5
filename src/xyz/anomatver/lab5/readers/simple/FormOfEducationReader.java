package xyz.anomatver.lab5.readers.simple;

import xyz.anomatver.lab5.models.FormOfEducation;

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
        System.out.println();
        System.out.println();
        scanner.nextLine(); // ??? без него не работает
        String formOfEducationString = scanner.nextLine();

        for (FormOfEducation sem : FormOfEducation.values()) {
            if (sem.name().equalsIgnoreCase(formOfEducationString)) {
                value = sem;
                break;
            }
        }
        return value;
    }
}
