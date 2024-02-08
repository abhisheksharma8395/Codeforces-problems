package Important_codechef;

import java.math.BigInteger;
import java.util.Scanner;

public class factorial_of_Big_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n= sc.nextInt();
        while(n-->0){
            int a;
            BigInteger prod=BigInteger.ONE;
            a=sc.nextInt();
            while(a>0){
                prod=(prod.multiply(BigInteger.valueOf(a)));
                a--;
            }
            System.out.println(prod);
        }
    }
}
