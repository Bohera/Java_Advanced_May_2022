package ExamPreparationExercises.hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    public String name;
    public int capacity;
    public List<Person> personList;

    public Hotel(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.personList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }


    public void add(Person person) {
        if (personList.size() < capacity) {
            personList.add(person);
        }
    }

    public int getCount() {
        return personList.size();
    }

    public boolean remove(String name) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getName().equals(name)) {
                personList.remove(i);
                return true;
            }
        }
        return false;
    }

    public Person getPerson(String name, String hometown) {
        for (int i = 0; i < this.personList.size(); i++) {
            if (personList.get(i).getName().equals(name) && personList.get(i).getHometown().equals(hometown)) {
                return personList.get(i);
            }
        }
        return null;
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("The people in the hotel %s are:%n", this.name));
        for (int i = 0; i < personList.size(); i++) {
            sb.append(personList.get(i).toString());
            sb.append(String.format("%n"));
        }
        return sb.toString();
    }
}
