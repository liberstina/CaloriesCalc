/**
 * Created by Marinka on 05.05.2017.
 */
public abstract class Vegetable {
    protected int calories;
    protected int weight;
    protected String color;
    protected final String name;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Vegetable(String name, int calories, int weight, String color) {
        this.name = this.getClass().getName();
        this.calories = calories;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = hash * 31 + calories;
        hash = hash * 31 + weight;
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
        Vegetable other = (Vegetable) obj;
        if (calories != other.calories)
            return false;
        if (weight != other.weight)
            return false;
        return true;
    }
}
