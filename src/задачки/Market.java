package задачки;

import java.io.*;

public class Market {
    public static void main(String[]args) throws IOException {
        BufferedReader reader0 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));

        double priceOfSweets = Double.parseDouble(reader0.readLine());
        double priceOfBiscuit = Double.parseDouble(reader1.readLine());


        double x = priceOfSweets*0.3 + priceOfBiscuit * 0.4;
        System.out.println(x);
        double y = priceOfSweets + priceOfBiscuit * 1.8;
        System.out.println(y);

        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));

        int minutes = Integer.parseInt(reader2.readLine());
        int kilometers = Integer.parseInt(reader3.readLine());

        int a = kilometers*1000/minutes*60;
        System.out.println(a);



    }
}
