package SetsAndMapsAdvanced;

import java.util.*;

public class test_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, String> map = new HashMap<>();

        //3 ways to iterate a map

        //Iterate the keys

        Set<Integer> integers = map.keySet();

        //Iterate the keys and values

        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        //Iterate values (don't use unless needed)

        Collection<String> values = map.values();

    }
}
