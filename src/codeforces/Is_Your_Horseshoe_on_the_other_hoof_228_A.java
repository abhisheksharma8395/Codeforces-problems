package codeforces;

import java.util.Scanner;

public class Is_Your_Horseshoe_on_the_other_hoof_228_A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int[] myarr=new int[4];
        for (int i = 0; i < 4; i++) {
            myarr[i]=sc.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = i+1; j <4; j++) {
                if(myarr[i]==myarr[j]){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count );
    }
}
