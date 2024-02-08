package codeforces;

import java.util.Scanner;

public class Panoramixs_Prediciton {
    public static boolean prime(int val){
        if(val<2){
            return false;
        }
        else{
            int x=val/2;
            for (int i = 2; i <=x; i++) {
                if(val%i==0){
                    return false;
                }
            }
            return true;
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n,j,temp=0;
        n=sc.nextInt();
        m=sc.nextInt();
        for (j = n+1; j <=m ; j++) {
            if (prime(j)) {
                temp = j;
                break;
            }
        }
        if(temp==m){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
