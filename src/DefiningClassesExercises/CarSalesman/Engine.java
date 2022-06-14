package DefiningClassesExercises.CarSalesman;

public class Engine {
    private String model;
    private String power;
    private String displacement;    //optional
    private String efficiency;     //optional

    public Engine(String model, String power, String displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    @Override
    public String toString() {
        return String.format("%s:%n" +
                "Power: %s%n" +
                "Displacement: %s%n" +
                "Efficiency: %s", this.model, this.power, this.displacement, this.efficiency);
    }
}
