package pack_write_read;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        Utilities utilities = new Utilities();
        utilities.writeData(3);
        String test = utilities.getStringFromFile("zapis1.txt");
        System.out.println(test);

        System.out.println();
        String[] strings = test.split(";");
        List<String> stringList = Arrays.asList(strings);
        stringList.forEach(System.out::println);
    }
}
