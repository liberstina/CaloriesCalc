import java.util.HashMap;
import java.util.Map;

/**
 * Created by Marinka on 05.05.2017.
 */
public class CaloriesCalculator {

    Potato potato = new Potato();
    Eggplant eggplant = new Eggplant();
    Tomato tomato = new Tomato();
    Cucumber cucumber = new Cucumber();
    public Map<Vegetable, Integer> saladCalories = new HashMap<Vegetable, Integer>();

    public void calculate(){

     //   * Demo.Hulio.salad.get(eggplant)
        System.out.println("Let's calculate calories of our salad");
       // for (Map.Entry<Vegetable, Integer> entry : saladCalories.entrySet())
        int sum = 0;
        saladCalories.put(potato, potato.calories);
       saladCalories.put(tomato, tomato.calories);
       saladCalories.put(cucumber, cucumber.calories);
       saladCalories.put(eggplant, eggplant.calories);

       for (Map.Entry<Vegetable, Integer> entry : saladCalories.entrySet()) {
           sum = sum + entry.getValue();
       }
       System.out.println("The sum of salad calories is " + sum);
    }
}
