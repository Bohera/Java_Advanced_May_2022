package DefiningClasses;

import java.util.Scanner;

public class CarConstructors_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //преименуваме този метод на "Main" преди предаване
        int carsCount = Integer.parseInt(scanner.nextLine());

        while (carsCount-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");

            String brand = tokens[0];

            Car car;

            if (tokens.length == 1) {
                car = new Car(brand);
            } else {
                String model = tokens[1];
                int horsePower = Integer.parseInt(tokens[2]);
                car = new Car(brand, model, horsePower);
            }

            System.out.println(car.carInfo());
        }
    }
}
