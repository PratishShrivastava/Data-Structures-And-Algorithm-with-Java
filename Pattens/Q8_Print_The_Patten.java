package Pattens;

// if n=4
// 1
// 23
// 456
// 78910

import java.util.Scanner;

public class Q8_Print_The_Patten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows: ");
        int n = sc.nextInt();

        int count = 1;

        for(int i=1;i<=n;++i){
            for(int j=1;j<=i;++j){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
