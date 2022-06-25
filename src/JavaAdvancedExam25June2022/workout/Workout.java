package JavaAdvancedExam25June2022.workout;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Workout {
    public String type;
    public int exerciseCount;
    public List<Exercise> exercises;

    public Workout(String type, int exerciseCount) {
        this.type = type;
        this.exerciseCount = exerciseCount;
        exercises = new ArrayList<>();
    }

    public void addExercise(Exercise exercise) {
        if (exercises.size() < exerciseCount) {
            exercises.add(exercise);
        }
    }

    public boolean removeExercise(String name, String muscle) {
        for (int i = 0; i < exercises.size(); i++) {
            Exercise currentExercise = exercises.get(i);
            if (currentExercise.getName().equals(name) && currentExercise.getMuscle().equals(muscle)) {
                exercises.remove(currentExercise);
                return true;
            }
        }
        return false;
    }

    public Exercise getExercise(String name, String muscle) {
        for (int i = 0; i < exercises.size(); i++) {
            Exercise currentExercise = exercises.get(i);
            if (currentExercise.getName().equals(name) && currentExercise.getMuscle().equals(muscle)) {
                return exercises.get(i);
            }
        }
        return null;
    }
    public Exercise getMostBurnedCaloriesExercise() {
        if (exercises.isEmpty()) {
            return null;
        }
        return exercises.stream().max(Comparator.comparing(Exercise::getBurnedCalories)).get();
    }

    public int getExerciseCount() {
        return this.exerciseCount;
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("Workout type: %s%n", this.type));
        for (int i = 0; i < exercises.size(); i++) {
            sb.append(String.format("%s%n", exercises.get(i)));
        }
        return sb.toString().trim();
    }
}
