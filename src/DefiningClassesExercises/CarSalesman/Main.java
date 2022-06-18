package DefiningClassesExercises.CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Engine> engineMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] engineInfo = scanner.nextLine().split("\\s+");
            //{Model} {Power} {Displacement} {Efficiency}
            // V4-33  140     28             B
            String name = engineInfo[0];
            String power = engineInfo[1];
            String displacement = "n/a";
            String efficiency = "n/a";
            if (engineInfo.length == 4) {
                displacement = engineInfo[2];
                efficiency = engineInfo[3];
            } else if (engineInfo.length == 3) {
                if (engineInfo[2].matches("\\d+")) {
                    displacement = engineInfo[2];
                } else {
                    efficiency = engineInfo[2];
                }
            }
            Engine engine = new Engine(name, power, displacement, efficiency);
            engineMap.put(name, engine);
        }

        int m = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < m; i++) {
            String[] carInfo = scanner.nextLine().split("\\s+");
            //{Model}   {Engine} {Weight} {Color}
            //FordFocus V4-33    1300     Silver
            String model = carInfo[0];
            String engine = carInfo[1];
            String weight = "n/a";
            String color = "n/a";
            if (carInfo.length == 4) {
                weight = carInfo[2];
                color = carInfo[3];
            } else if (carInfo.length == 3) {
                if (carInfo[2].matches("\\d+")) {
                    weight = carInfo[2];
                } else {
                    color = carInfo[2];
                }
            }
            Car car = new Car(model, engineMap.get(engine), weight, color);
            System.out.println(car);
        }
    }
}
