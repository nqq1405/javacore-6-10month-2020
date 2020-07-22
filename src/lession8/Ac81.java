package lession8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ac81 {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();// get O(1) , add O(1), remove O(n)
        List<Integer> b = new LinkedList<>();// get O(n), add O(1), remove O(n)

        long batdau;
        long kthuc;
        long Timetest;
        batdau = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            a.add(i);
//            b.add(i);
        }
        kthuc = System.nanoTime();
        Timetest = kthuc - batdau;
        System.out.println("ArrayList test add: " + Timetest);

        batdau = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
//            a.add(i);
            b.add(i);
        }
        kthuc = System.nanoTime();
        Timetest = kthuc - batdau;
        System.out.println("LinkedList test add: " + Timetest);


        batdau = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            a.get(i);
//            b.add(i);
        }
        kthuc = System.nanoTime();
        Timetest = kthuc - batdau;
        System.out.println("ArrayList test get: " + Timetest);

        batdau = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
//            a.add(i);
            b.get(i);
        }
        kthuc = System.nanoTime();
        Timetest = kthuc - batdau;
        System.out.println("LinkedList test get: " + Timetest);


        batdau = System.nanoTime();
        for (int i = 9999; i < 0; i--) {
            a.remove(i);
//            b.add(i);
        }
        kthuc = System.nanoTime();
        Timetest = kthuc - batdau;
        System.out.println("ArrayList test remove: " + Timetest);

        batdau = System.nanoTime();
        for (int i = 9999; i < 0; i--) {
//            a.add(i);
            b.remove(i);
        }
        kthuc = System.nanoTime();
        Timetest = kthuc - batdau;
        System.out.println("LinkedList test remove: " + Timetest);
    }
}
