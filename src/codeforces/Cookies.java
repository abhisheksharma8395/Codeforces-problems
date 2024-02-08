package codeforces;

import java.util.Scanner;

public class Cookies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,count_even=0,count_odd=0;
        n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            int temp=sc.nextInt();
            if(temp%2==0){
                count_even++;
            }
            else{
                count_odd++;
            }
        }
        if(count_odd%2==0){
            System.out.println(count_even);
        }
        else{
            System.out.println(count_odd);
        }
    }
}
