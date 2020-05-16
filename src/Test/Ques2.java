package Test;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();// inputting the number
        dec_bin(n);

    }
// function to convert dec to binary
    public static void dec_bin(int n) {
        int[] bin_num = new int[32];
        int i = 0;
        while (n > 0) {//converting to binary
            bin_num[i] = n % 2;
            n = n / 2;
            i++;
        }
//        for (int k = i - 1; k >= 0; k--) {
//            System.out.print(bin_num[k]);
//        }
        complement(bin_num,i);//sending to complement function


    }

    public static void complement(int[] bin_num,int l){
        for (int i = 0; i <l ; i++) {
            if(bin_num[i]==0){
                bin_num[i]=1;
            }
            else if(bin_num[i]==1){
                bin_num[i]=0;
            }

        }
        int comp=0;//storing new dec value
        int a=l-1;
        for (int i =l-1; i >=0 ; i--) {
//            System.out.print(bin_num[i]);
             comp+=bin_num[i]*Math.pow(2,a);
                     a--;
        }
        System.out.println(comp);//printing the value
    }
}

