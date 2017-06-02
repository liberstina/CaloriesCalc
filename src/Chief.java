
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Marinka on 05.05.2017.
 */
public class Chief {
    //Why protected?
    protected static Potato potato;
    protected static Eggplant eggplant;
    protected static Tomato tomato;
    protected static Cucumber cucumber;

    //CONSTRUCTOR INITS STATIC CLASS MEMBERS - мы говорили о переменных экземпляра и класса! Забыла! Повторить
    public Chief() {
        this.potato = new Potato();
        this.eggplant = new Eggplant();
        this.tomato = new Tomato();
        this.cucumber = new Cucumber();
    }

    public static Potato getPotato() {
        return potato;
    }

    public static Eggplant getEggplant() {
        return eggplant;
    }

    public static Tomato getTomato() {
        return tomato;
    }

    public static Cucumber getCucumber() {
        return cucumber;
    }

    //Why separated from other class variables?
    private static Map<Vegetable, Integer> salad = new HashMap<>();

    public static Map<Vegetable, Integer> getSalad() {
        return salad;
    }

    //Мы говорили о принимаемых параментрах переменной длины - тут можно было бы воспользоваться, т.к. все входящие переменные одного типа
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

    //Remove total vegetables count of current selected type?
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
        //Very good!
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
        System.out.println("Let's find vegetable by color: " + color);
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
        //Inner variable starts from capitalize letter - not according to code convention
        String Result = "";
        for (Map.Entry<Vegetable, String> pair : findColor.entrySet()) {
            if (color.equals(pair.getValue())) {
                Result = pair.getKey().toString();
                break;
            } else
                Result = "There is no such vegetable. Try again.";
        }
        System.out.println(Result);
    }

    //Maybe, this method should be in vegetables class?
    public void compareVegetables(Vegetable vegetable, Vegetable vegetable1) {
        System.out.println("Let's compare " + vegetable + " and " + vegetable1);
        if (vegetable.equals(vegetable1))
            System.out.println("These two vegetables are equal");
        else
            System.out.println("These two vegetables are not equal");
    }

    public void sayHello() {
        System.out.println("Hello! Today we will cook salad");
    }
}
