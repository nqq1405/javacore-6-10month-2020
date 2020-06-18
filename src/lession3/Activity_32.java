package lession3;

import java.util.Scanner;

public class Activity_32 {

    public static void fibonacci(int n, int[] mang) {
        int a = 0;

        int a1 = 0, a2 = 1, c = 0;
        for (int i = 1; i <= n; i++) {
            if (i < n) {
                System.out.print(a1 + ",");
            } else if (i == n) {
                System.out.print(a1);
            }
            mang[c++] = a;
            a = a1 + a2;
            a1 = a2;
            a2 = a;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Nhap a:");
        int a = in.nextInt();
        int[] mang = new int[a];

        fibonacci(a, mang);
//        System.out.println("\nmang:");
//        for (int i = 0; i < mang.length; i++) {
//            System.out.print(mang[i] + ";");
//        }
    }
}
