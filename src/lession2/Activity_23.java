package lession2;

import java.util.Scanner;

public class Activity_23 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Nhap a:");
        int a = in.nextInt();

        System.out.println("KQ:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + "*" + i + "=" + a * i);
        }
    }
}
