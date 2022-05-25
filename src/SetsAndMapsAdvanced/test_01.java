package SetsAndMapsAdvanced;

import java.util.*;

public class test_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        hashSet.add(31);
        hashSet.add(23);
        hashSet.add(42);
        hashSet.add(11);

        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(4);
        treeSet.add(1);

        linkedHashSet.add(3);
        linkedHashSet.add(2);
        linkedHashSet.add(4);
        linkedHashSet.add(1);

        for (Integer e : hashSet) {
            System.out.println(e);
        }
        System.out.println();
        for (Integer e : treeSet) {
            System.out.println(e);
        }
        System.out.println();
        for (Integer e : linkedHashSet) {
            System.out.println(e);
        }
    }
}
