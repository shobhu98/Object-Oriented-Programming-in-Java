package Test;

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();// enter rows
        int n=s.nextInt();// enter columns
        int[][] arr=new int[m][n];// declaring 2d array

        for (int i = 0; i <arr.length ; i++) {//scanning values
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j]=s.nextInt();

            }

        }
        int output=0;// storing negative numbers
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
               if(arr[i][j]<0){//condition for negative numbers
                   output++;
               }

            }


        }
        System.out.println(output);// printing the output
    }
}
