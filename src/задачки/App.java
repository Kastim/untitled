package задачки;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class App {

    public static void main(String[] args) {
        new App().exec();
    }

    public void exec() {
        BufferedReader reader = null;
        try {
            URL site = new URL("https://www.duolingo.com/");
            reader = new BufferedReader(new InputStreamReader(site.openStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException ex) {
            //... 
        } finally {
            try {
                reader.close();
            } catch (IOException ex) {
                //... 
            }
        }

    }
} 