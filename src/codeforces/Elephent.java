package codeforces;

import java.util.Scanner;

public class Elephent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, count = 0;
        x = sc.nextInt();
        while (x > 5) {
            count++;
            x -= 5;
        }
        count++;
        System.out.println(count);
    }
}
