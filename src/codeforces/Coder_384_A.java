package codeforces;

import java.util.Scanner;

public class Coder_384_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i % 2 == 0) && (j % 2 == 0)) {
                    System.out.print("C");
                } else if ((i % 2 != 0) && (j % 2 != 0)) {
                    System.out.print("C");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println(" ");
        }
    }


}
