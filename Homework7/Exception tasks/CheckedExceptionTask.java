package homework_7.exceptionTasks;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionTask {
    static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.err.println("Ошибка: файл не найден!");
        } catch (IOException ex) {
            System.err.println("Ошибка чтения файла: " + ex.getMessage());
        }
    }
}
