package codeforces;

import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;
        double ave;
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a;
            a = sc.nextInt();
            sum += a;
        }
        ave = (double) sum / n;
        System.out.println(ave);

    }
}
