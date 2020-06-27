package lession4;

import java.util.Scanner;

public class Activity_44 {

    private static Scanner sc = new Scanner(System.in);

    static void nhapmang(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
    }

    static int max(int[] a, int n) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }

    static int min(int[] a, int n) {
        int min = a[0];
        for (int i = 0; i < n; i++) {
            if (min >= a[i]) {
                min = a[i];
            }
        }
        return min;
    }

    static int max2trongmang(int[] a, int n) {
        int max1 = max(a, n);
        int max2 = a[0];
        for (int i = 0; i < n; i++) {
            if (max1 == a[i]) {
                continue;
            } else if (max2 < a[i]) {
                max2 = a[i];
            }
        }
        return max2;
    }

    static int min2trongmang(int[] a, int n) {
        int min1 = min(a, n);
        int min2 = a[0];
        for (int i = 0; i < n; i++) {
            if (min2 >= a[i] && a[i] != min1) {
                min2 = a[i];
            }
        }
        return min2;
    }

    static void thayptbang0(int[] a, int n){
        for (int i = 0; i < n; i++) {
            if(a[i]<0){
                a[i] = 0;
            }
        }
    }

    static void sx(int[] a, int n){
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (a[i]>a[j]){
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        nhapmang(a, n);
        System.out.println("Gia Tri max:" + max(a, n));
        System.out.println("Gia Tri min:" + min(a, n));
        System.out.println("Gia Tri max2:" + max2trongmang(a, n));
        System.out.println("Gia Tri min2:" + min2trongmang(a, n));
        thayptbang0(a,n);
        System.out.println("Mang thay cac so am bang 0");
        for (int k: a) {
            System.out.print(k+" ");
        }
        sx(a,n);
        System.out.println("\nMang sau khi sap xep");
        for (int k: a) {
            System.out.print(k+" ");
        }
    }
}
