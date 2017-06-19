/**
 * Created by Marinka on 05.05.2017.
 */
public class Potato extends Vegetable {
    public Potato(int weight) {
        super("potato", weight * 25 / 100, weight, "grey");
    }

    @Override
    public String toString() {
        return name;
    }
}
