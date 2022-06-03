package FunctionalProgrammingExercises;

public class test_03 {
    public static void main(String[] args) {

        SimpleFunctionalInterface text = (String myText) -> Integer.parseInt(myText);
        System.out.println(text.parse("12"));

    }

}
