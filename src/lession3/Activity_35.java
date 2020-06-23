package lession3;

public class Activity_35 {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7 + i; j++) {
                if (j + i == 6 + 2 * i || j + i == 6) {
                    System.out.print("A");
                } else if (j + i == 7 || j + i == 5 + i + i && !(j + i == 5 + 2 * 0)) {
                    System.out.print("B");
                } else if (j + i == 8 || j + i == 4 + i + i && !(j + i == 4 + 2 * 0)) {
                    System.out.print("C");
                } else if (j + i == 9 || j + i == 3 + i + i && !(j + i == 3 + 2 * 0) && !(j + i == 3 + 2 * 1)) {
                    System.out.print("D");
                } else if (j + i == 10 || j + i == 2 + i + i && !(j + i == 2 + 2 * 0) && !(j + i == 2 + 2 * 1)) {
                    System.out.print("E");
                } else if (j + i == 11 || j + i == 1 + i + i && !(j + i == 1 + 2 * 0) && !(j + i == 1 + 2 * 1) && !(j + i == 1 + 2 * 2)) {
                    System.out.print("F");
                } else if (j + i == 12) {
                    System.out.print("G");
                } else System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 6; i > 0; i--) {
            for (int j = 0; j < 6 + i; j++) {
                if (j + i == 7 || j + i == 5 + 2 * i) {
                    System.out.print("A");
                } else if (j + i == 8 || j + i == 4 + 2 * i && !(j + i == 4 + 2 * 1)) {
                    System.out.print("B");
                } else if (j + i == 9 || j + i == 3 + 2 * i && !(j + i == 3 + 2 * 1)) {
                    System.out.print("C");
                } else if (j + i == 10 || j + i == 2 + 2 * i && !(j + i == 2 + 2 * 1) && !(j + i == 2 + 2 * 2)) {
                    System.out.print("D");
                } else if (j + i == 11 || j + i == 1 + 2 * i && !(j + i == 1 + 2 * 1) && !(j + i == 1 + 2 * 2)) {
                    System.out.print("E");
                } else if (j + i == 12 || j + i == 0 + 2 * i && !(j + i == 0 + 2 * 1) && !(j + i == 0 + 2 * 2) && !(j + i == 0 + 2 * 3)) {
                    System.out.print("F");
                } else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
