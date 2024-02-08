package codeforces;

import java.util.Scanner;

public class Die_Roll {
    int gcd(int a,int b){
        int hcf=1;
        int max= a>b?a:b;
        for (int i = 1; i <=max; i++) {
            if((a%i==0)&&(b%i==0)){
                hcf=i;
            }
        }
        return hcf;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Die_Roll dr=new Die_Roll();
        int y,w,max_roll,total_outcome,favourable_outcome,common_divisor,numerator,denominator;
        y=sc.nextInt();
        w=sc.nextInt();
        max_roll= y>w?y:w;
        total_outcome=6;
        favourable_outcome=6-max_roll+1;
        common_divisor= dr.gcd(total_outcome,favourable_outcome);
        numerator=favourable_outcome/common_divisor;
        denominator=total_outcome/common_divisor;
        System.out.println(numerator+"/"+denominator);
    }

}
