package codeforces;

import java.util.Scanner;

public class Roma_and_Lucky_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,a,sum=0;
        n=sc.nextInt();
        a=sc.nextInt();
        while(n>0){
            int b,count=0;
            b=sc.nextInt();
            while(b!=0){
                if(((b%10)==4)||((b%10)==7)){
                    count+=1;
                }
                b/=10;
            }
            if(count<=a){
                sum+=1;
            }
            n--;
        }
        System.out.println(sum);
    }
}
