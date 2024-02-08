package codeforces;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        int i,j,temp;
        int[] myarray =new int[4];
        Scanner sc=new Scanner(System.in);
        for (i=0;i<4;i++){
            myarray[i]=sc.nextInt();
        }
        for(i=0;i<4;i++){
            for (j = i+1; j <4 ; j++) {
                if(myarray[i]>myarray[j]){
                    temp=myarray[i];           //swapping
                    myarray[i]=myarray[j];
                    myarray[j]=temp;
                }
            }
        }
        if(((myarray[0]+myarray[1])>myarray[2])||((myarray[1]+myarray[2])>myarray[3])){
            System.out.println("TRIANGLE");
        }
        else if(((myarray[0]+myarray[1])==myarray[2])||((myarray[1]+myarray[2])==myarray[3])){
            System.out.println("SEGMENT");
        }
        else{
            System.out.println("IMPOSSIBLE");
        }
    }
}
