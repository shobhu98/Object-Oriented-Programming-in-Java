package Test;

import java.util.Scanner;

public class Optimized_Sol_ques1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();// enter rows
        int n=s.nextInt();// enter columns
        int[][] arr=new int[m][n];// declaring 2d array
        int output=0;
        for (int i = 0; i <arr.length ; i++) {//scanning values
            for (int j = 0; j <arr[i].length ; j++) {
                int x=s.nextInt();
                if(x<0){
                    output++;
                }
                arr[i][j]=x;


            }

        }

        System.out.println(output);// printing the output
    }
}
