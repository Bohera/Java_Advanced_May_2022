package ExercisesStacksAndQueues;

public class test_05 {
    public static void main(String[] args) {
        //recursive
        a(5);
    }
    public static void a(int number) {
        if (number == 0) {
            return;
        }
        System.out.println(number);
        number--;
        a(number);
    }
    public static void b() {
        System.out.println("B");
    }
}
