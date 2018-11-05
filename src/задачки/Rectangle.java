package задачки;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Rectangle {
    public static void main(String[] args) throws Exception {
        int a = 647;
        int b = 170;
        int c = a / 30 * (b / 30);
        System.out.println(c);


        BufferedReader reader0 = new BufferedReader(new InputStreamReader(System.in));
        int d = Integer.parseInt(reader0.readLine());

        if (d < 7) {
            System.out.println("Yes");
        } else if (d > 10) {
            System.out.println("No");
        } else {
            System.out.println("Error");
        }


        ArrayList list = new ArrayList();
        list.add("январь");
        list.add("февраль");
        list.add("март");
        list.add("апрель");
        list.add("май");
        list.add("июнь");
        list.add("июль");
        list.add("август");
        list.add("сентябрь");
        list.add("октябрь");
        list.add("ноябрь");
        list.add("декабрь");
        list.add(0, 0);


        int f = 0;
        while (f == 0) {
            System.out.println("Please, enter the month number");
            BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
            f = Integer.parseInt(reader1.readLine());

            if (f<1||f>12){
                f = 0;
                System.out.println("Incorrect number!!!");
            }
        }

            if (f == 12 || f <= 2) {
                System.out.println("Winter " + list.get(f));
            } else if (f >= 3 || f <= 5) {
                System.out.println("Spring " + list.get(f));
            } else if (f >= 6 || f <= 8) {
                System.out.println("Summer " + list.get(f));
            } else if (f >= 9 || f <= 11) {
                System.out.println("Fail " + list.get(f));
            }
        }
    }


