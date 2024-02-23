package codeforces;

import java.util.Scanner;

public class Police_Recruits_427_A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0,nottreated=0;
        int[] myarr=new int[n];
        for (int i = 0; i < n; i++) {
            myarr[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(myarr[i]==-1){
                if(count>=1){
                    count--;
                }
                else{
                    nottreated++;
                }
            }
            else{
                count+=myarr[i];
            }
        }
        System.out.println(nottreated);
    }
}
