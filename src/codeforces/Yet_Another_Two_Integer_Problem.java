package codeforces;

import java.util.Scanner;

public class Yet_Another_Two_Integer_Problem {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        int myarr[]=new int[n];
        for (i = 0; i <n ; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a>b){
                if(((a-b)%10)==0){
                    myarr[i]=((a-b)/10);
                }
                else{
                    myarr[i]=(((a-b)/10)+1);
                }
            }
            else{
                if(((b-a)%10)==0){
                    myarr[i]=((b-a)/10);
                }
                else{
                    myarr[i]=(((b-a)/10)+1);
                }
            }
        }
        for (i = 0; i <n; i++) {
            System.out.println(myarr[i]+" ");
        }
    }

}
