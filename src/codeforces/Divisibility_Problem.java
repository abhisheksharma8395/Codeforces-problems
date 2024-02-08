package codeforces;

import java.util.Scanner;

public class Divisibility_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i=0;

        n = sc.nextInt();
        int[] marry=new int[n];
        while (i < n)

        {
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            if (a % b != 0) {
                marry[i] = (b - (a % b));
            } else {
                marry[i] = 0;
            }
            i++;
        }
        i=0;
        while(i<n){
            System.out.println(marry[i]);
            i++;
        }
    }
    }

