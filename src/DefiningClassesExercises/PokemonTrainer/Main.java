package DefiningClassesExercises.PokemonTrainer;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] commands = scanner.nextLine().split("\\s+");

        Map<String, Trainer> trainers = new LinkedHashMap<>();

        while (!commands[0].equals("Tournament")) {
            String trainerName = commands[0];
            String pokemonName = commands[1];
            String pokemonElement = commands[2];
            int pokemonHealth = Integer.parseInt(commands[3]);

            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            if (!trainers.containsKey(trainerName)) {
                Trainer trainer = new Trainer(trainerName);
                trainers.put(trainerName, trainer);
            }
            trainers.get(trainerName).getPokemons().add(pokemon);

            commands = scanner.nextLine().split("\\s+");
        }

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String finalCommand = command;

            trainers.forEach((k, v) -> {
                int pokemonCount = v.getPokemons().size();
                boolean hasElement = false;
                for (int i = 0; i < pokemonCount; i++) {
                    if (v.getPokemons().get(i).getElement().equals(finalCommand)) {
                        v.setBadges(v.getBadges() + 1);
                        hasElement = true;
                        break;
                    }
                }
                if (!hasElement) {
                    for (int i = 0; i < pokemonCount; i++) {
                        if (v.getPokemons().get(i).getHealth() - 10 <= 0) {
                            v.getPokemons().remove(i);
                            pokemonCount--;
                        } else {
                            v.getPokemons().get(i).setHealth(v.getPokemons().get(i).getHealth() - 10);
                        }
                    }
                }
            });
            command = scanner.nextLine();
        }

        trainers.values().stream().sorted(Comparator.comparing(Trainer::getBadges).reversed()).forEach(System.out::println);
    }
}
