import java.util.HashMap;
import java.util.Map;

/**
 * Created by Marinka on 05.05.2017.
 */
public class CaloriesCalculator {

    //simplify your solution - compare lines count. Performed actions are the same
    public void calculate() {
        Map<Vegetable, Integer> saladCalories = new HashMap<>();
        saladCalories.putAll(Chief.getSalad());
        System.out.println("Let's calculate calories of our salad");
        int sum = 0;
        for (Map.Entry<Vegetable, Integer> entry : saladCalories.entrySet())
            if (entry.getKey().equals(Chief.getPotato())) {
                sum = sum + entry.getValue() * Chief.getPotato().calories;
                //saladCalories.put(Chief.getPotato(), entry.getValue() * Chief.getPotato().calories);
            } else if (entry.getKey().equals(Chief.getTomato())) {
                sum = sum + entry.getValue() * Chief.getTomato().calories;
                //saladCalories.put(Chief.getTomato(), entry.getValue() * Chief.getTomato().calories);
            } else if (entry.getKey().equals(Chief.getCucumber())) {
                sum = sum + entry.getValue() * Chief.getCucumber().calories;
                //saladCalories.put(Chief.getCucumber(), entry.getValue() * Chief.getCucumber().calories);
            } else if (entry.getKey().equals(Chief.getEggplant())) {
                sum = sum + entry.getValue() * Chief.getEggplant().calories;
                //saladCalories.put(Chief.getEggplant(), entry.getValue() * Chief.getEggplant().calories);
            }

        /*for (Map.Entry<Vegetable, Integer> entry1 : saladCalories.entrySet()) {
            sum = sum + entry1.getValue();
        }*/
        System.out.println("The sum of salad calories is " + sum);
    }
}
