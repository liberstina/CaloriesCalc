import java.util.HashMap;
import java.util.Map;

/**
 * Created by Marinka on 05.05.2017.
 */
public class CaloriesCalculator {

    public void calculate(Map <Vegetable, Integer> saladCalories) {
        System.out.println("Let's calculate calories of our salad");
        int sum = 0;
        for (Map.Entry<Vegetable, Integer> entry : saladCalories.entrySet()){
            int caloriesInOneInstance = entry.getKey().getCalories();
        sum = sum + entry.getValue()*caloriesInOneInstance;
        }
        System.out.println("The sum of salad calories is " + sum);
    }
}
