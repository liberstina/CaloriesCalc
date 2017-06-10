
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Marinka on 05.05.2017.
 */
public class Chief {

    private Potato potato;
    private Eggplant eggplant;
    private Tomato tomato;
    private Cucumber cucumber;
    private Map<Vegetable, Integer> salad;

    //CONSTRUCTOR INITS STATIC CLASS MEMBERS - мы говорили о переменных экземпляра и класса! Забыла! Повторить
    public Chief(Potato potato, Eggplant eggplant, Tomato tomato, Cucumber cucumber){//Vegetable ... vegetables) {
        /*Vegetable[] vegetables1 = vegetables;
        for (Vegetable v: vegetables1) {
            if(v instanceof Potato){
                this.potato = (Potato) v;
            }
        }*/
        this.potato = potato;
        this.eggplant = eggplant;
        this.tomato = tomato;
        this.cucumber = cucumber;
        this.salad = new HashMap<>();
    }

    public Potato getPotato() {
        return potato;
    }

    public Eggplant getEggplant() {
        return eggplant;
    }

    public Tomato getTomato() {
        return tomato;
    }

    public Cucumber getCucumber() {
        return cucumber;
    }


    public Map<Vegetable, Integer> getSalad() {
        return salad;
    }

    public Map<Vegetable, Integer> createSalad(List<Vegetable> mySalad) {
        for (int i = 0; i < mySalad.size(); i++){
            salad.put(mySalad.get(i), mySalad.get(i).getWeight());
        }
        System.out.println("Salad is created!");
        return salad;
    }

    public Map<Vegetable, Integer> addVegetables(Vegetable vegetable, int weight) {
        System.out.println("Let's make salad tastier and add something...");
        System.out.println("Let's add " + vegetable);
        int value = salad.get(vegetable);
        salad.put((Vegetable) vegetable, value + weight);
        return salad;
    }
    //Remove total vegetables count of current selected type?
    public Map<Vegetable, Integer> removeVegetables(Vegetable vegetable) {
        System.out.println("Let's make salad tastier and remove " + vegetable);
        salad.remove(vegetable);
        return salad;
    }

    public void displaySaladIngridients(Map<Vegetable, Integer> salad) {
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

    public void sortVegetablesByWeight(Map<Vegetable, Integer> salad) {
        System.out.println("Let's sort our salad by weight!");
        salad.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
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
        String result = "";
        for (Map.Entry<Vegetable, String> pair : findColor.entrySet()) {
            if (color.equals(pair.getValue())) {
                result = pair.getKey().toString();
                break;
            } else
                result = "There is no such vegetable. Try again.";
        }
        System.out.println(result);
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
