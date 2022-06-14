package Generics.GenericArrayCreator;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = ArrayCreator.create(13, 69);
        for (Integer o : arr) {
            System.out.println(o);
        }
        Integer[] arr2 = ArrayCreator.create(13,79);
        for (Integer o : arr2) {
            System.out.println(o);
        }
    }
}
