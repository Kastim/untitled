package задачки;

import java.io.*;

public class ThreeNumbers {
    public static void main (String[]args) throws IOException {
        BufferedReader reader0 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader0.readLine());
        int b = Integer.parseInt(reader1.readLine());
        int c = Integer.parseInt(reader2.readLine());

        a*=2;
        b-=3;
        c*=c;

        System.out.println(a+b+c);

        int x = (a+b+c)/3;
        int y = (a+c)*2-c*3;
        System.out.println(x);
        System.out.println(y);

        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        int d = Integer.parseInt(reader3.readLine());

        int e=d*4;
        System.out.println(e);
        d*=d;
        System.out.println(d);

    }
}
