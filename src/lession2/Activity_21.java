package lession2;

import java.util.Scanner;

/*
*  Write a simple program to read two number from the keyboard and display the result of some operations on the screen
*   Write a simple program to read two number (a, b) from the keyboard and display the result of below operations on the screen:
1. a+b
2. a-b
3. a*b
4. a/b
5. a%b

Example:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
* */
public class Activity_21 {

    public static int tong(int a, int b) {
        return a + b;
    }

    public static int hieu(int a, int b) {
        return a - b;
    }

    public static int tich(int a, int b) {
        return a * b;
    }

    public static float thuong(int a, int b) {
        return (float)a / b;
    }

    public static int p_du(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Nhap a:");
        int a = in.nextInt();

        System.out.printf("Nhap b:");
        int b = in.nextInt();

        System.out.println("Tong 2 so:"+tong(a,b));
        System.out.println("Hieu 2 so:"+hieu(a,b));
        System.out.println("Tich 2 so:"+tich(a,b));
        System.out.println("Thuong 2 so:"+thuong(a,b));
        System.out.println("chia du 2 so:"+p_du(a,b));
    }

}
