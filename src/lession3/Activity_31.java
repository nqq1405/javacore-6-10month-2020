package lession3;

import java.util.Scanner;

public class Activity_31 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Nhap a:");
        int a = in.nextInt();

        for (int i=0; i<a; i++){
            for (int j=0;j<a+i;j++){
                if(j+i >= a-1 ){
                    System.out.print("*");
                }else System.out.print("^");
            }
            System.out.println();
        }

    }

}
