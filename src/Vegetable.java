/**
 * Created by Marinka on 05.05.2017.
 */
public class Vegetable {
    public int calories; //in 100 gramms
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

    public Vegetable(int calories, String color) {
        this.calories = calories;
        this.color = color;
        //this.weight = weight;
    }


}
