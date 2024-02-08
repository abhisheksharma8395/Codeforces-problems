package codeforces;
import java.util.Scanner;
import java.util.Arrays;
public class Holiday_Of_Equality {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,count=0;
        n=sc.nextInt();
        int[] myarr2=new int[n];
        for(i=0;i<n;i++){
            myarr2[i]=sc.nextInt();
        }
        Arrays.stream(myarr2).sorted();
        for(i=0;i<n;i++){
            while(myarr2[i]!=myarr2[n-1]){
                count++;
                myarr2[i]+=1;
            }
        }
        System.out.println(count);
    }

}
