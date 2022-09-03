package Pattens;

// if n=4
// 1234
// 123
// 12
// 1

import java.util.Scanner;

public class Q7_Print_The_Patten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;++i){
            for(int j=1;j<=n-i+1;++j){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
