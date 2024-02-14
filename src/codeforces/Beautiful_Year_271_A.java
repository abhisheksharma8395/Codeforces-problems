package codeforces;

import java.util.Scanner;

public class Beautiful_Year_271_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        n = n + 1;
        while (true) {
            int o = n % 10;
            int t = (n % 100) / 10;
            int h = (n % 1000) / 100;
            int th = (n / 1000);
            if (o != t && o != h && o != th && t != h && t != th && h != th) {
                System.out.println(n);
                break;
            }
            n++;
        }
    }
}
