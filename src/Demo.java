import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marinka on 05.05.2017.
 */
public class Demo {

    public static void main(String[] args) {

        CaloriesCalculator caloriesCalculator = new CaloriesCalculator();
        Chief hulio = new Chief();
        hulio.sayHello();
        hulio.createSalad(2, 1, 3, 4);
        hulio.displaySaladIngridients();
        caloriesCalculator.calculate();
        hulio.addVegetables(hulio.getPotato(), 1);
        hulio.displaySaladIngridients();
        hulio.removeVegetables(hulio.getEggplant());
        caloriesCalculator.calculate();
        hulio.displaySaladIngridients();
        hulio.sortVegetablesByWeight();
        hulio.sortVegetablesByCalories();
        hulio.compareVegetables(hulio.getTomato(), hulio.getCucumber());
        hulio.findVegetablesByColor("red");
    }
}