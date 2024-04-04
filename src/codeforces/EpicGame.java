package codeforces;

import java.util.Scanner;

public class EpicGame {
    private static int gcd(int val1,int val2){
        if (val2 == 0) {
            return val1;
        }
        else{
            return gcd(val2, val1 % val2);
            }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();
        int initialpoints = scanner.nextInt();
        while(true){
            if(val1>initialpoints){
                System.out.println("1");
                return;
            }
            initialpoints -= gcd(val1,initialpoints);
            if(val2>initialpoints){
                System.out.println("0");
                return;
            }
            initialpoints -= gcd(val2,initialpoints);
        }
    }
}
