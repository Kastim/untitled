package задачки;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoVariables {
    public static void main(String[] args) throws IOException {
        BufferedReader reader0 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader0.readLine());
        int b = Integer.parseInt(reader1.readLine());

        int[] ab = {a, b};

        if (a > b) {
            System.out.println(a+" Yes");
        } else {
            a=a+b;
            b=a-b;
            a=a-b;
            System.out.println(a+""+b);
        }
        if ((a-b)>=100||(a-b)<=-100){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}