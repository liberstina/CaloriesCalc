/**
 * Created by Marinka on 05.05.2017.
 */
public class Potato extends Vegetable {
    public Potato(int weight) {super("potato", weight*25/100, weight);}

    @Override
    public String toString() {
        return name;
    }
}
