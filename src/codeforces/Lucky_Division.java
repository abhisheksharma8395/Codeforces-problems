package codeforces;

import java.util.Scanner;

public class Lucky_Division {
    public static boolean islucky(int val){
        while(val!=0){
            if(((val%10)!=4) && ((val%10)!=7)){
                return false;
            }
            val/=10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(islucky(n)){
            System.out.println("YES");
        } else if (n%4==0 ||n%7==0 ||n%44==0 ||n%47==0 ||n%74==0 ||n%77==0 ||n%444==0 ||n%447==0 ||n%474==0 ||n%477==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }

}
