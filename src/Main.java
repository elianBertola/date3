import java.time.DayOfWeek;
import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        //creazione data
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        //ottenzione dati
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();
        DayOfWeek weekDay = date.getDayOfWeek();

        //stampa dati
        System.out.println("Anno: " + year + "\nMese: " + month + "\nGiorno: " + day +
                "\nGiorno della settimana: " + weekDay);
    }
}