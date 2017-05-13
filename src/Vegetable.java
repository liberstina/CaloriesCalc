/**
 * Created by Marinka on 05.05.2017.
 */
public abstract class Vegetable {
    protected final int calories;
    protected final String color;
    protected final int weight;

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        //this.calories = calories;
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
        //this.weight = weight;
    }

    public Vegetable(int calories, String color, int weight) {
        this.calories = calories;
        this.color = color;
        this.weight = weight;
    }


}
