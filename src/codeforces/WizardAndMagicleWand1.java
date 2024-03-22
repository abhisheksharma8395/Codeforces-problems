package codeforces;

import java.util.Scanner;

public class WizardAndMagicleWand1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] myarr = new int[a];
        for (int i = 0; i < a; i++) {
            myarr[i]=sc.nextInt();
        }
        int[] arr = new int[b];
        for (int i = 0; i < b; i++) {
            arr[i]=sc.nextInt();
        }
        int[] resultingarr = new int[b];
        for (int i = 0; i < b; i++) {
            int count=0;
            for (int j = 0; j < a; j++) {
                if(myarr[j]>arr[i]){
                    count+=myarr[j]-arr[i];
                }
                else{
                    count+=arr[i]-myarr[j];
                }
            }
            resultingarr[i]=count;
        }
        for (int i = 0; i < b ; i++) {
            System.out.print(resultingarr[i]+" ");
        }
    }
}
