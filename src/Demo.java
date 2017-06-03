import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Marinka on 05.05.2017.
 */
public class Demo {

    public static void main(String[] args) {
        Potato potato = new Potato(50);
        Eggplant eggplant = new Eggplant(30);
        Cucumber cucumber = new Cucumber(200);
        Tomato tomato = new Tomato(150);
        List<Vegetable> myPocket = new ArrayList<>();
        myPocket.add(eggplant);
        myPocket.add(potato);
        myPocket.add(cucumber);
        myPocket.add(tomato);
        CaloriesCalculator caloriesCalculator = new CaloriesCalculator();
        Chief hulio = new Chief();
        hulio.sayHello();
        hulio.createSalad(myPocket);
        hulio.displaySaladIngridients();
        Map<Vegetable, Integer> vegetableIntegerMap = hulio.getSalad();
        caloriesCalculator.calculate(vegetableIntegerMap);
        hulio.addVegetables(tomato, 100);
        hulio.displaySaladIngridients();
        hulio.removeVegetables(potato);
        caloriesCalculator.calculate(vegetableIntegerMap);
        hulio.displaySaladIngridients();
        hulio.sortVegetablesByWeight();
        hulio.sortVegetablesByCalories();
        hulio.compareVegetables(hulio.getTomato(), hulio.getCucumber());
        hulio.findVegetablesByColor("red");
    }
}