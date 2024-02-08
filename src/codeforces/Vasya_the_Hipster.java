package codeforces;

import java.util.Scanner;

public class Vasya_the_Hipster {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>=b){
            System.out.println(b+" "+(a-b));
        }
        else {
            System.out.printf(a+" "+(b-a));
        }
    }

}
