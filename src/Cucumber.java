/**
 * Created by Marinka on 05.05.2017.
 */
public class Cucumber extends Vegetable {
    public Cucumber(int weight) {
        super("cucumber", weight * 20 / 100, weight, "green");
    }

    @Override
    public String toString() {
        return name;
    }
}
