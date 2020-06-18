package lession3;

import java.util.Scanner;

public class Activity_33 {

    static void binary(int a, int[] b){
        int k,c=0;
        while (a > 0){
            k = a%2;
            a/=2;
            b[c++]=k;
        }
        for (int i = c-1; i >= 0 ; i--) {
            System.out.print(b[i]);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Nhap a:");
        int a = in.nextInt();
        int[] b = new int[1000];

        binary(a,b);


    }
}
