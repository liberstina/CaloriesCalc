/**
 * Created by Marinka on 05.05.2017.
 */
public class Eggplant extends Vegetable {
    public Eggplant(int weight) {super("eggplant", weight*40/100, weight);}

    @Override
    public String toString() {
        return name;
    }
}
