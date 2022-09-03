package Pattens;

// if n=4
//    *
//   **
//  ***
// ****

import java.util.Scanner;

public class Q5_Print_The_Patten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;++i){
            for(int j=0;j<n-i;++j){
                System.out.print(' ');
            }
            for(int j=1;j<=i;++j){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
