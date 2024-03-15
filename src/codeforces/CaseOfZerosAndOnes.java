package codeforces;

import java.util.Scanner;

public class CaseOfZerosAndOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] myarr = sc.next().toCharArray();
        int countz = 0;
        int counto = 0;
        for (int i = 0; i < n; i++) {
            if (myarr[i] == '0') {
                countz++;
            } else {
                counto++;
            }
        }
        if(counto-countz>0){
            System.out.println(counto-countz);
        }
        else{
            System.out.println(countz-counto);
        }
    }
}
