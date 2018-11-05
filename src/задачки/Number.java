package задачки;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number {
    public static void main(String[] args) throws IOException {

        double a = Math.random();
        System.out.println(a);
        a =(int) a;
        System.out.println(a);
        if (a >= -10 && a < 10) {
            a += 5;
        } else {
            a -= 10;
        }
        System.out.println(a);

        if (a<-100||a>100){
            a =0;
        } else {
            a+=1;
        }
        System.out.println(a);



        BufferedReader reader0 = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(reader0.readLine());

        if (2<=b && b<=5){
            b+= 10;
        } else if (b>=7 && b<=40){
            b-=100;
        } else if (b<0 | b>3000){
            b*=3;
        } else {
            b=0;
        }
        System.out.println(b);


        if (a%2==0 && a!=10 && b!=10){
            System.out.println(a+b);
        } else{
            System.out.println(a*b);
        }
        System.out.println(10%3);
    }
}
