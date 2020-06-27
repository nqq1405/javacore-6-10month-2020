package lession4;

public class Activity_45 {

    public static void main(String[] args) {
        String abc = "I love PlusPlus Academy";
        char[] abc1 = abc.toCharArray();
        for (int i = abc.length() - 1; i >= 0 ; i--) {
            System.out.print(abc.charAt(i));
        }
    }
}
