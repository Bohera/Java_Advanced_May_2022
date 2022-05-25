package SetsAndMapsAdvanced;

import java.util.Scanner;

public class test_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = "Az sum pich";
        String second = "Ti si pich ama golem";
        String third = "Blalalalalalalalallalalala";

        int firstHash = first.hashCode();
        int secondHash = second.hashCode();
        int thirdHash = third.hashCode();

        System.out.println(firstHash);
        System.out.println(secondHash);
        System.out.println(thirdHash);
    }
}
