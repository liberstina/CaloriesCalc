import java.util.HashMap;
import java.util.Map;

/**
 * Created by Marinka on 05.05.2017.
 */
public class CaloriesCalculator {

    @Kulenkova(info = "test", expected = Vegetable.class)
    public void calculate(Map<Vegetable, Integer> salad) {
        System.out.println("Let's calculate calories of our salad");
        int sum = 0;
        Map<Vegetable, Integer> saladCalories = new HashMap<>();
        for (Map.Entry<Vegetable, Integer> entry : salad.entrySet()) {
            saladCalories.put(entry.getKey(), entry.getKey().getCalories() * entry.getValue() / 100);
        }
        for (Map.Entry<Vegetable, Integer> entry : saladCalories.entrySet()) {

            sum = sum + entry.getValue();
        }
        System.out.println("The sum of salad calories is " + sum);
    }
}
