package Pattens;


// if c=5 and r=4
// *****
// *****
// *****
// *****

import java.util.Scanner;

public class Q1_Print_The_Patten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Rows: ");
        int r = sc.nextInt();

        System.out.println("Enter the Columns: ");
        int c = sc.nextInt();

        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;++j){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
