package codeforces;

import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        char[][] draw = new char[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(i%2==0){
                    draw[i][j]='#';
                }
                if(i%2!=0){
                    if(j==col-1){
                        draw[i][j]='#';
                    }
                    else{
                        draw[i][j]='.';
                    }
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(draw[i][j]);
            }
            System.out.println(" ");

        }
    }

}
