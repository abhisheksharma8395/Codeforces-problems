package codeforces;
import java.util.Scanner;
import java.util.Arrays;
public class Holiday_Of_Equality {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,count=0;
        n=sc.nextInt();
        int myarr[]=new int[n];
        for(i=0;i<n;i++){
            myarr[i]=sc.nextInt();
        }
        Arrays.stream(myarr).sorted();
        for(i=0;i<n;i++){
            while(myarr[i]!=myarr[n-1]){
                count++;
                myarr[i]+=1;
            }
        }
        System.out.println(count);
    }

}
