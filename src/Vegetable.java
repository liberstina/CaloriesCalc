/**
 * Created by Marinka on 05.05.2017.
 */
public class Vegetable {
    public int calories;
    public final String color;
    public int weight;

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setColor(String color) {
        //this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Vegetable(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }
}
