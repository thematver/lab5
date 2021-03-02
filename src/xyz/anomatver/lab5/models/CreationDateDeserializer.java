package xyz.anomatver.lab5.models;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.time.*;
/**
 * Класс для корректной десериализации JSON у объекта типа ZonedDateTime.
 *
 * @author Матвей
 *
 */
public class CreationDateDeserializer implements JsonDeserializer<ZonedDateTime> {
    public ZonedDateTime deserialize(JsonElement je, Type type,
                                     JsonDeserializationContext jdc)
            throws JsonParseException {
        JsonObject jo = je.getAsJsonObject();
        JsonObject dateTime = jo.getAsJsonObject("dateTime");
        JsonObject date = dateTime.getAsJsonObject("date");
        JsonObject time = dateTime.getAsJsonObject("time");

        int year = date.getAsJsonPrimitive("year").getAsInt();
        int month = date.getAsJsonPrimitive("month").getAsInt();

        int dayOfMonth = date.getAsJsonPrimitive("day").getAsInt();

        int hour = time.getAsJsonPrimitive("hour").getAsInt();
        int minute = time.getAsJsonPrimitive("minute").getAsInt();

        int seconds = time.getAsJsonPrimitive("second").getAsInt();
        int nano = time.getAsJsonPrimitive("nano").getAsInt();

        String zone = jo.getAsJsonObject("zone").getAsJsonPrimitive("id").getAsString();
        ZoneId zoneId = ZoneId.of(zone);
      return ZonedDateTime.of(LocalDateTime.of(LocalDate.of(year, month, dayOfMonth), LocalTime.of(hour, minute, seconds, nano)), zoneId);
    }
}
