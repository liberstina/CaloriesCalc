import org.omg.CORBA.NO_IMPLEMENT;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by Marinka on 05.05.2017.
 */
public class Chief {
    Potato potato = new Potato();
    Eggplant eggplant = new Eggplant();
    Tomato tomato = new Tomato();
    Cucumber cucumber = new Cucumber();

    public Map<Vegetable, Integer> salad = new HashMap<Vegetable, Integer>();
    public Map<Vegetable, Integer> sortByWeight = new HashMap<Vegetable, Integer>();
    public Map<Vegetable, Integer> sortByCalories = new HashMap<Vegetable, Integer>();
    public Map<Vegetable, String> findColor = new HashMap<Vegetable, String>();

    public Map<Vegetable, Integer> createSalad(int potatoes, int eggplants, int tomatoes, int cucumbers){
        salad.put(potato, potatoes);
        salad.put(eggplant, eggplants);
        salad.put(tomato, tomatoes);
        salad.put(cucumber, cucumbers);

        System.out.println("Salad is created!");
        return salad;
    }

    public Map<Vegetable, Integer> addVegetables(Vegetable vegetable, int quantity){
        System.out.println("Let's make salad tastier and add something...");
        System.out.println("Let's add " + vegetable);

        int value = (Integer) salad.get(vegetable);
        salad.put(vegetable, value + quantity);
        return salad;
    }

    public Map<Vegetable, Integer> removeVegetables(Vegetable vegetable){
        System.out.println("Let's make salad tastier and remove " + vegetable);
        salad.remove(vegetable);
        return salad;

    }

    public void displaySaladIngridients(){
        System.out.println("Salad consists of " + salad.toString());
    }

    public void sortVegetablesByCalories(){
        sortByCalories.put(potato, potato.calories);
        sortByCalories.put(eggplant, eggplant.calories);
        sortByCalories.put(cucumber, cucumber.calories);
        sortByCalories.put(tomato, tomato.calories);
        System.out.println("Let's sort our salad by calories!");
        sortByCalories.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

    }

    public void sortVegetablesByWeight(){
        sortByWeight.put(potato, potato.weight);
        sortByWeight.put(eggplant, eggplant.weight);
        sortByWeight.put(cucumber, cucumber.weight);
        sortByWeight.put(tomato, tomato.weight);
        System.out.println("Let's sort our salad by weight!");
        sortByWeight.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

    }

    public void findVegetablesByColor(String color) {
        String NoVegetable = "There is no such vegetable. Try again.";
        String Find = "";
        System.out.println("Let's find vegetable by color " + color);
        System.out.println(findColor.get(color));
        if (findColor.containsKey(color))
            System.out.println(findColor.get(color));
        else
            System.out.println(NoVegetable);
        /*
        for (Map.Entry<Vegetable, String> entry : findColor.entrySet()) {
            if (entry.getValue().equals(color))
                Find = findColor.;
            else
                Find = NoVegetable;
        }
        System.out.println(Find);
        */
    }
    public void compareVegetables(Vegetable vegetable, Vegetable vegetable1){

        if (vegetable.equals(vegetable1))
            System.out.println("These two vegetables are equal");
        else
            System.out.println("These two vegetables are not equal");
    }

    public void sayHello(){
        System.out.println("Hello! Today we will cook salad");
    }

}
