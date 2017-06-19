import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Marinka on 05.05.2017.
 */
public class Demo {

    public static void main(String[] args) {
        Potato potato = new Potato(50);
        Eggplant eggplant = new Eggplant(130);
        Cucumber cucumber = new Cucumber(200);
        Tomato tomato = new Tomato(150);
        List<Vegetable> myPocket = new ArrayList<>();
        myPocket.add(eggplant);
        myPocket.add(potato);
        myPocket.add(cucumber);
        myPocket.add(tomato);
        CaloriesCalculator caloriesCalculator = new CaloriesCalculator();
        Chief hulio = new Chief(potato, eggplant, tomato, cucumber);
        hulio.sayHello();
        Map<Vegetable, Integer> createdSalad = hulio.createSalad(myPocket);
        hulio.displaySaladIngridients(createdSalad);
        Map<Vegetable, Integer> vegetableIntegerMap = hulio.getSalad();
        caloriesCalculator.calculate(createdSalad);
        hulio.addVegetables(tomato, 100);
        hulio.displaySaladIngridients(createdSalad);
        hulio.removeVegetables(potato);
        caloriesCalculator.calculate(createdSalad);
        hulio.displaySaladIngridients(createdSalad);
        hulio.sortVegetablesByWeight(createdSalad);
        hulio.sortVegetablesByCalories(createdSalad);
        hulio.compareVegetables(hulio.getTomato(), hulio.getCucumber());
        hulio.findVegetablesByColor("green");
    }
}