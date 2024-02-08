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
        System.out.println(Math.max((sum - n), 0));
    }
}
