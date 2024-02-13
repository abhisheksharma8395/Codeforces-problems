package codeforces;

import java.util.Scanner;

public class System_Of_Equation_214_A {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n,m,b,count=0;
        n=sc.nextInt();
        m=sc.nextInt();
        for (int i = 0; i <= Math.sqrt(n); i++) {
            b=n-(i*i);
            if(((b*b)+i)==m){
                count++;
            }
        }
        System.out.println(count);
    }
}
