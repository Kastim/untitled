package src;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Read {
    public static void main(String[] args) {


        try {
            FileInputStream fstream = new FileInputStream("F:\\Jawa\\Проекты\\untitled/file.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                System.out.println(strLine);
            }
        } catch (IOException e) {
            System.out.println("Ошибка");
        }
    }
}
