package ExamPreparationMoreExercises.ExamRetakeApril2022.easterBasket;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Basket {

        public String material;
        public int capacity;
        public List<Egg> data;

    public Basket(String material, int capacity) {
        this.material = material;
        this.capacity = capacity;
        data = new ArrayList<>();
    }
    public void addEgg(Egg egg){
        if (data.size() + 1 <= capacity) {
            data.add(egg);
        }
    }

    public boolean removeEgg(String color) {
        boolean isRemoved = false;
        for (int i = 0; i < data.size(); i++) {
            Egg currentEgg = data.get(i);
            if(currentEgg.getColor().equals(color)) {
                data.remove(i);
                isRemoved = true;
                break;
            }
        }
        return isRemoved;
    }

    public Egg getStrongestEgg() {
        return data.stream().max(Comparator.comparing(e -> e.getStrength())).get();
    }

    public Egg getEgg(String color) {
        return data.stream().filter(egg -> egg.getColor().equals(color)).findFirst().get();
    }

    public int getCount() {
        return data.size();
    }

    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s basket contains:%n", this.material));
        for (Egg e : data) {
            sb.append(String.format("%s%n", e.toString()));

        }
        return sb.toString().trim();
    }
}
