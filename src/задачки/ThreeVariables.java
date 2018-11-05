package задачки;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeVariables {
    public static void main(String[] args) throws IOException {
        BufferedReader reader0 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader0.readLine());
        int b = Integer.parseInt(reader1.readLine());
        int c = Integer.parseInt(reader2.readLine());
        int d = 0;
        if (a % 5 == 0) {
            d = a;
        }
        if (b % 5 == 0) {
            d += b;
        }
        if (c % 5 == 0) {
            d += c;
        }
        if (d != 0) {
            System.out.println(d);
        } else {
            System.out.println("error");
        }

        if (a>b&&a>c){
            System.out.println(a);
        }else if (b>a&&b>c){
            System.out.println(b);
        }else if (c>a&&c>b){
            System.out.println(c);
        }else {
            System.out.println("not found");
        }

        if((a+b)>(a+c)&&(a+b)>(b+c)) {
            System.out.println(a + " " + b);
        } else if((a+c)>(a+b)&&(a+c)>(b+c)){
            System.out.println(a+" "+c);
        }else if((b+c)>(a+c)&&(b+c)>(b+c)){
            System.out.println(b+" "+c);
        } else {
            System.out.println("==");
        }


        if (a==b||a==c||b==c){
            System.out.println("yes2==");
        } else {
            System.out.println("2!==");
        }

        if ((a+b)==c||(a+c)==b||(b+c)==a){
            System.out.println("yes2=3");
        }
        if ((a<5&&b<5)||(a<5&&c<5)||(b<5&&c<5)){
            System.out.println("2<5");
        } else {
            System.out.println("2!<5");
        }
        int e=0;
        if (a>0){
            e++;
        }
        if (b>0){
            e++;
        }
        if (c>0){
            e++;
        }
        System.out.println(">0 "+e);

        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader3.readLine());
        if(a>5 && b>5 && c%6==0 && x%3!=0){
            System.out.println("yes 4 if");
        } else {
            System.out.println("no 4 if");
        }
    }

}

