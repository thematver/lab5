package xyz.anomatver.lab5.models;
/**
 * Модель координат.
 *
 * @author Матвей
 *
 */
public class Coordinates {
    private float x;
    private Long y; //Значение поля должно быть больше -97, Поле не может быть null

    public Coordinates(float x, Long y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(x: %f, y: %d)", x, y);
    }

    public String toJson() {
        return String.format("{'x': %f, 'y': %d}", x, y);
    }
}
