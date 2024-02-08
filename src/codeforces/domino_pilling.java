package codeforces;

import java.util.Scanner;

public class domino_pilling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m,p,s;
        n=sc.nextInt();
        m=sc.nextInt();
        ///(int) is used for type casting, specifically to cast the
        // result of Math.floor(p / 2.0) to an int. The reason for this is that the Math.
        // floor function returns a double value, and you might want to store the result
        // as an
        // int if you know that the result will always be a whole number.
        //
        //In the given context, you're calculating p / 2.0 and then using Math.floor to
        // round down to the nearest integer. The result is then cast to int to store it as
        // an integer. If you're fine with having a floating-point result, you can omit the
        // (int) cast. However, if you want the result to be an integer,
        // the cast is necessary to convert the double result to an int.
        p=n*m;
        s =(int)Math.floor(p/2.0);
        System.out.println(s);
    }
}
