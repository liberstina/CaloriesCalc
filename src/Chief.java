import org.omg.CORBA.NO_IMPLEMENT;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by Marinka on 05.05.2017.
 */
public class Chief {
    private Potato potato = new Potato();
    private Eggplant eggplant = new Eggplant();
    private Tomato tomato = new Tomato();
    private Cucumber cucumber = new Cucumber();

    private Map<Vegetable, Integer> salad = new HashMap<>();

    public Map<Vegetable, Integer> createSalad(int potatoes, int eggplants, int tomatoes, int cucumbers) {
        salad.put(potato, potatoes);
        salad.put(eggplant, eggplants);
        salad.put(tomato, tomatoes);
        salad.put(cucumber, cucumbers);
        System.out.println("Salad is created!");
        return salad;
    }

    public Map<Vegetable, Integer> addVegetables(Vegetable vegetable, int quantity) {
        System.out.println("Let's make salad tastier and add something...");
        System.out.println("Let's add " + vegetable);

        int value = salad.get(vegetable);
        salad.put(vegetable, value + quantity);
        return salad;
    }

    public Map<Vegetable, Integer> removeVegetables(Vegetable vegetable) {
        System.out.println("Let's make salad tastier and remove " + vegetable);
        salad.remove(vegetable);
        return salad;

    }

    public void displaySaladIngridients() {
        System.out.println("Salad consists of " + salad.toString());
    }

    public void sortVegetablesByCalories() {
        System.out.println("Let's sort our salad by calories!");
        Map<Vegetable, Integer> sortByCalories = new HashMap<>();
        sortByCalories.putAll(salad);
        for (Map.Entry<Vegetable, Integer> entry : sortByCalories.entrySet()) {
            if (entry.getKey().equals(potato)) {
                int potatoCalories = potato.getCalories() * entry.getValue();
                sortByCalories.put(potato, potatoCalories);
            } else if (entry.getKey().equals(tomato)) {
                int tomatoCalories = tomato.getCalories() * entry.getValue();
                sortByCalories.put(tomato, tomatoCalories);
            } else if (entry.getKey().equals(cucumber)) {
                int cucumberCalories = cucumber.getCalories() * entry.getValue();
                sortByCalories.put(cucumber, cucumberCalories);
            } else if (entry.getKey().equals(eggplant)) {
                int eggplantCalories = eggplant.getCalories() * entry.getValue();
                sortByCalories.put(eggplant, eggplantCalories);
            }
        }
        sortByCalories.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }

    public void sortVegetablesByWeight() {
        System.out.println("Let's sort our salad by weight!");
        Map<Vegetable, Integer> sortByWeight = new HashMap<>();
        sortByWeight.putAll(salad);
        for (Map.Entry<Vegetable, Integer> entry : sortByWeight.entrySet()) {
            if (entry.getKey().equals(potato)) {
                int potatoWeight = potato.getWeight() * entry.getValue();
                sortByWeight.put(potato, potatoWeight);
            } else if (entry.getKey().equals(tomato)) {
                int tomatoWeight = tomato.getWeight() * entry.getValue();
                sortByWeight.put(tomato, tomatoWeight);
            } else if (entry.getKey().equals(cucumber)) {
                int cucumberWeight = cucumber.getWeight() * entry.getValue();
                sortByWeight.put(cucumber, cucumberWeight);
            } else if (entry.getKey().equals(eggplant)) {
                int eggplantWeight = eggplant.getWeight() * entry.getValue();
                sortByWeight.put(eggplant, eggplantWeight);
            }
        }
        sortByWeight.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);


    }

    public void findVegetablesByColor(String color) {
        System.out.println("Let's find vegetable by color " + color);
        Map<Vegetable, String> findColor = new HashMap<>();

        for (Map.Entry<Vegetable, Integer> entry : salad.entrySet()) {
            if (entry.getKey().equals(potato)) {
                findColor.put(potato, potato.getColor());
            } else if (entry.getKey().equals(tomato)) {
                findColor.put(tomato, tomato.getColor());
            } else if (entry.getKey().equals(cucumber)) {
                findColor.put(cucumber, cucumber.getColor());
            } else if (entry.getKey().equals(eggplant)) {
                findColor.put(eggplant, eggplant.getColor());
            }
        }
        String NoVegetable = "There is no such vegetable. Try again.";
        for (Map.Entry<Vegetable, String> pair : findColor.entrySet()) {
            if (color.equals(pair.getValue()))
                System.out.println(pair.getKey());
            
            else

                System.out.println(NoVegetable);
        }
    }


    public void compareVegetables(Vegetable vegetable, Vegetable vegetable1) {

        if (vegetable.equals(vegetable1))
            System.out.println("These two vegetables are equal");
        else
            System.out.println("These two vegetables are not equal");
    }

    public void sayHello() {
        System.out.println("Hello! Today we will cook salad");
    }

}
