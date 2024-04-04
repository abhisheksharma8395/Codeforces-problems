package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Cards_701A {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] myarr=new int[n];
        for (int i = 0; i < n; i++) {
            myarr[i]=sc.nextInt();
        }
        Arrays.sort(myarr);
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=myarr[i];
        }
        int p= sum/(n/2);
        for(int i=0;i<n;i++){
            for (int j = i+1; j < n ; j++) {
                if(myarr[i]+myarr[j]==p){
                    System.out.println((i+1)+" "+(j+1));
                    i=i+1;
                    break;

                }
            }
        }
    }
}
