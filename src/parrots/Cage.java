package parrots;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cage {
    public String name;
    public int capacity;
    public List<Parrot> data;

    public Cage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        data = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(Parrot parrot) {
        if (data.size() < capacity) {
            data.add(parrot);
        }
    }

    public boolean remove(String name) {
        boolean isRemoved = false;
        for (int i = 0; i < data.size(); i++) {
            Parrot parrot = data.get(i);
            if (parrot.getName().equals(name)) {
                data.remove(parrot);
                isRemoved = true;
            }
        }
        return isRemoved;
    }

    public Parrot sellParrot(String name) {
        Parrot parrot = null;
        for (int i = 0; i < data.size(); i++) {
            parrot = data.get(i);
            if(parrot.getName().equals(name)){
                parrot.setAvailable(false);
                break;
            }
        }
        return parrot;
    }

    public List<Parrot> sellParrotBySpecies(String species) {
        List<Parrot> soldParrots = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            Parrot parrot = data.get(i);
            if(parrot.getSpecies().equals(species)){
                parrot.setAvailable(false);
                soldParrots.add(parrot);
            }
        }
        return soldParrots;
    }

    public int count(){
        return data.size();
    }

    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Parrots available at %s:%n",this.name));
        List<Parrot> isAvailableList = data.stream().filter(Parrot::isAvailable).collect(Collectors.toList());
        isAvailableList.forEach(p -> sb.append(p).append(String.format("%n")));
        return sb.toString().trim();
    }
}
