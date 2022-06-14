package DefiningClassesExercises.CarSalesman;

public class Car {
        private String model;
        private Engine engine;
        private String weight;
        private String color;

        public Car(String model, Engine engine, String weight, String color) {
                this.model = model;
                this.engine = engine;
                this.weight = weight;
                this.color = color;
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
                        "%s%n" +
                        "Weight: %s%n" +
                        "Color: %s", this.model, this.engine.toString(), this.weight, this.color);
        }
}
