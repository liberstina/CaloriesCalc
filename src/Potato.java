/**
 * Created by Marinka on 05.05.2017.
 */
public class Potato extends Vegetable {
    private final int caloriesPotato = 12;

    public Potato(int weight) {
        super("grey", weight);
        this.calories = caloriesPotato * weight / 100;
    }
}
