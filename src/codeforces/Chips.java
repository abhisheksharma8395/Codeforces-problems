package codeforces;
import java.util.Scanner;
public class Chips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, i;
        a = sc.nextInt();
        b = sc.nextInt();
        boolean c = true;
        while (c) {
            for (i = 1; i <= a; i++) {
                if (b >= i) {
                    b -= i;
                } else {
                    c = false;
                    break;
                }
            }
        }
        System.out.println(b);
    }
}
