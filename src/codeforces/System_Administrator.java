package codeforces;
import java.util.Scanner;

public class System_Administrator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, sn, ps, pl, sta = 0, stb = 0;

        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            sn = scanner.nextInt();
            ps = scanner.nextInt();
            pl = scanner.nextInt();

            if (sn == 1) {
                sta += ps - pl;
            } else {
                stb += ps - pl;
            }
        }

        if (sta >= 0) {
            System.out.println("LIVE");
        } else {
            System.out.println("DEAD");
        }

        if (stb >= 0) {
            System.out.println("LIVE");
        } else {
            System.out.println("DEAD");
        }
    }
}
