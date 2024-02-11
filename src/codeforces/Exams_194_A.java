package codeforces;

import java.util.Scanner;

public class Exams_194_A {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if((b/a)>2){
            System.out.println(a);
        }
        else{
            System.out.println((3*a)-b);
        }
    }
}
