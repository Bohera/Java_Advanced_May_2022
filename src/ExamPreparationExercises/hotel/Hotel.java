package ExamPreparationExercises.hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    public String name;
    public int capacity;
    public List<Person> roster;


    public Hotel(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        roster = new ArrayList<>();
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
        return roster;
    }

    public void setPersonList(List<Person> personList) {
        this.roster = personList;
    }


    public void add(Person person) {
        if (this.roster.size() < this.capacity) {
            this.roster.add(person);
        }
    }

    public int getCount() {
        return roster.size();
    }

    public boolean remove(String name) {
        for (int i = 0; i < roster.size(); i++) {
            if (roster.get(i).getName().equals(name)) {
                roster.remove(i);
                return true;
            }
        }
        return false;
    }

    public Person getPerson(String name, String hometown) {
        for (int i = 0; i < this.roster.size(); i++) {
            if (roster.get(i).getName().equals(name) && roster.get(i).getHometown().equals(hometown)) {
                return roster.get(i);
            }
        }
        return null;
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("The people in the ExamPreparationExercises.hotel %s are:%n", this.name));
        for (int i = 0; i < roster.size(); i++) {
            sb.append(roster.get(i).toString());
            sb.append(String.format("%n"));
        }
        return sb.toString();
    }
}
