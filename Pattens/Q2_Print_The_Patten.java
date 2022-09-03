package Pattens;

// if c=5 and r=4
// *****
// *   *
// *   *
// *****

import java.util.Scanner;

public class Q2_Print_The_Patten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows: ");
        int r = sc.nextInt();

        System.out.print("Enter the columns: ");
        int c = sc.nextInt();

        for(int i=0;i<r;++i){
            for(int j=0;j<c;++j){
                if(i==0 || j==0 || i==r-1 || j == c-1){
                    System.out.print('*');
                }else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
