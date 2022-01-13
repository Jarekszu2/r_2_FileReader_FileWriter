package pack_write_read;

import java.io.*;

class Utilities {

    void writeData(int number) {
        System.out.println();

//        try(PrintWriter printWriter = new PrintWriter(new FileWriter("zapis1.txt", true))) {
        try(PrintWriter printWriter = new PrintWriter(new FileWriter("zapis1.txt"))) {
            for (int i = 0; i < number; i++) {
                printWriter.println((i + 1) + ". Hallo world!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    String getStringFromFile(String pathFileName) {
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        String result;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFileName))) {
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(";");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        result = stringBuilder.toString();
        return result;
    }
}
