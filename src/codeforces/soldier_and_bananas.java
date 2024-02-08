package codeforces;

import java.util.Scanner;

public class soldier_and_bananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k, n, w, sum = 0;
        k = sc.nextInt();
        n = sc.nextInt();
        w = sc.nextInt();
        for (int i = 1; i <= w; i++) {
            sum += i * k;
        }
        if ((sum - n) > 0) {
            System.out.println(sum - n);
        } else {
            System.out.println(0);
        }
    }
}
