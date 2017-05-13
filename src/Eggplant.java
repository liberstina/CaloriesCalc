/**
 * Created by Marinka on 05.05.2017.
 */
public class Eggplant extends Vegetable {
    public Eggplant() {
        super(40, "violet", 120);
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = hash * 31 + calories;
        hash = hash * 31 + weight;
        hash = hash * 31 + color.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cucumber other = (Cucumber) obj;
        if (calories != other.calories)
            return false;
        if (weight != other.weight)
            return false;
        if (!color.equals(other.color))
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "Eggplant";
    }
}
