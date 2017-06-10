/**
 * Created by Marinka on 05.05.2017.
 */
public class Tomato extends Vegetable {
    public Tomato(int weight) {super("tomato",weight*30/100, weight);}

    @Override
    public String toString() {
        return name;
    }
}
