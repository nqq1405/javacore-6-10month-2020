package lession2;

/*
*  input: User input a number n
Output: Print result of operation: n + nn + nnn = ?

Example:
Input number: 5
Expect output:
5 + 55 + 555 = 615
* */

import java.util.Scanner;

public class Activity_22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Nhap a:");
        int a = in.nextInt();
        System.out.println("KQ "+a*1+"+"+a*11+"+"+a*111+":" + a*(1+11+111));
    }
}
