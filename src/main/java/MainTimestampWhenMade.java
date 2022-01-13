/*
 Napisz program, a w tym programie wczytaj jedną linię ze skanera od użytkownika.Poproś użytkownika o 'adres pliku'. Po wpisaniu zweryfikuj czy wybrany plik/katalog istnieje,czy jest plikiem/katalogiem, jaki jest jego: rozmiar, czas ostatniej modyfikacji i czy mamyprawa do odczytu/zapisu do tego pliku/katalogu
 */

import java.io.*;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainTimestampWhenMade {
    public static void main(String[] args) {
        System.out.println();

        File file = new File(".gitignore");

        String line;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();
        Timestamp timestamp = new Timestamp(file.lastModified());
        LocalDateTime localDateTime = timestamp.toLocalDateTime();
        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println("Date of creation: " + localDate + ".");

        System.out.println();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Date of creation: " + localDateTime.format(dateTimeFormatter) + ".");

    }
}
