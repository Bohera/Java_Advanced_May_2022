package DefiningClassesExercises.Google;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Person> personMap = new LinkedHashMap();
        String line = scanner.nextLine();
        while (!line.equals("End")) {
            String[] data = line.split("\\s+");
            String name = data[0];
            if (!personMap.containsKey(name)) {
                Person person = new Person(name);
                personMap.put(name, person);
            }

            switch (data[1]) {
                case "company":
                    Company company = new Company(data[2], data[3], Double.parseDouble(data[4]));
                    personMap.get(name).setCompany(company);
                    break;
                case "pokemon":
                    Pokemon pokemon = new Pokemon(data[2],data[3]);
                    personMap.get(name).getPokemons().add(pokemon);
                    break;
                case "parents":
                    Parent parent = new Parent(data[2],data[3]);
                    personMap.get(name).getParents().add(parent);
                    break;
                case "children":
                    Children child = new Children(data[2],data[3]);
                    personMap.get(name).getChildren().add(child);
                    break;
                case "car":
                    Car car = new Car(data[2], Integer.parseInt(data[3]));
                    personMap.get(name).setCar(car);
                    break;
            }
            line = scanner.nextLine();
        }
        String nameToFind = scanner.nextLine();
        System.out.println(personMap.get(nameToFind));
    }
}
