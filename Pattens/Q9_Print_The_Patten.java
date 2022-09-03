package Pattens;

// if n=4
// 1
// 01
// 101
// 0101

import java.util.Scanner;

public class Q9_Print_The_Patten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;++i){
            for(int j=1;j<=i;++j){
                if((i+j)%2==0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
