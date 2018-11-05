package задачки;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader0 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader0.readLine());
        int b = Integer.parseInt(reader1.readLine());

        double hypotenuse = Math.sqrt(a*a+b*b);
        double place = a*b/2;
        double perimeter = a+b+hypotenuse;
        System.out.println("hypotenuse="+hypotenuse+" place="+place+" perimeter="+perimeter);


        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));

        double celsius = Double.parseDouble(reader2.readLine());

        double fahrenheit = celsius*1.8+32;
        System.out.println(fahrenheit);


        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader4 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader5 = new BufferedReader(new InputStreamReader(System.in));
        int week = Integer.parseInt(reader3.readLine());
        int month = Integer.parseInt(reader4.readLine());
        int years = Integer.parseInt(reader5.readLine());
        int days = week*7+month*30+years*365;
        System.out.println(days);


        BufferedReader reader6 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("contribution");
        BufferedReader reader7 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("percent");
        double contribution = Double.parseDouble(reader6.readLine());
        double percent = Double.parseDouble(reader7.readLine());
        double summ1 = contribution + contribution/100*percent;
        double summ2 = summ1 + summ1/100*percent;
        double summ3 = summ2 + summ2/100*percent;
        double summ4 = summ3 + summ3/100*percent;
        double summ5 = summ4 + summ4/100*percent;

        System.out.println(summ5);

        for (int i =0; i<5;i++){
            contribution = contribution+contribution/100*percent;
        }
        System.out.println(contribution);
    }
}
