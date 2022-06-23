package DefiningClassesExercises.Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    public String name;
    public Company company;
    public List<Pokemon> pokemons;
    public List<Parent> parents;
    public List<Children> children;
    public Car car;

    public Person(String name) {
        this.name = name;
        pokemons = new ArrayList<>();
        parents = new ArrayList<>();
        children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public List<Parent> getParents() {
        return parents;
    }

    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }

    public List<Children> getChildren() {
        return children;
    }

    public void setChildren(List<Children> children) {
        this.children = children;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s%n", this.name));
        sb.append(String.format("Company:%n"));
        if (company != null) {
            sb.append(String.format("%s %s %.2f%n", company.getName(), company.getDepartment(), company.getSalary()));
        }
        sb.append(String.format("Car:%n"));
        if (car != null) {
            sb.append(String.format("%s %d%n", car.getModel(), car.getSpeed()));
        }
        sb.append(String.format("Pokemon:%n"));
        if (!pokemons.isEmpty()) {
            for (Pokemon pokemon : pokemons) {
                sb.append(String.format("%s %s%n", pokemon.getName(), pokemon.getType()));
            }
        }
        sb.append(String.format("Parents:%n"));
        if (!parents.isEmpty()) {
            for (Parent parent : parents) {
                sb.append(String.format("%s %s%n", parent.getName(), parent.getBirthday()));
            }
        }
        sb.append(String.format("Children:%n"));
        if (!children.isEmpty()) {
            for (Children child : children) {
                sb.append(String.format("%s %s%n", child.getName(), child.getBirthday()));
            }
        }
        return sb.toString().trim();

    }
}
