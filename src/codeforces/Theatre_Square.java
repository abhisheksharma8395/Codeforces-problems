package codeforces;

import java.util.Scanner;

public class Theatre_Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n,m,a;
        n=sc.nextInt();
        m=sc.nextInt();
        a=sc.nextInt();
        System.out.println((long)(Math.ceil((double)n/a))*(Math.ceil((double)m/a)));
    }
}
