package codeforces;

import java.util.Scanner;

public class Calculating_Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long  n,sum;
        n = sc.nextLong();
        if(n%2==0){
            sum = n/2;
        }
        else{
            sum=(((n+1)/2)*(-1));
        }
        System.out.println(sum);
    }
}
