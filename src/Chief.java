import java.util.HashMap;
import java.util.Map;

/**
 * Created by Marinka on 05.05.2017.
 */
public class Chief {

    private int potatoes;
    private int eggplants;
    private int tomatoes;
    private int cucumbers;

    Potato potato = new Potato(120);
    /*Eggplant eggplant = new Eggplant(100);
    Tomato tomato = new Tomato(70);
    Cucumber cucumber = new Cucumber(70);*/

    public Map<Vegetable, Integer> salad = new HashMap<>();

    public Map<Vegetable, Integer> getSalad() {
        return salad;
    }

    /*public Map<Vegetable, Integer> createSalad() {
        System.out.println("To add potatoes to salad enter number of gramms or either enter 0");
        Scanner scan = new Scanner(System.in);
        potatoes = scan.nextInt();
        System.out.println("To add eggplants to salad enter number of gramms or either enter 0");
        eggplants = scan.nextInt();
        System.out.println("To add tomatoes to salad enter number of gramms or either enter 0");
        tomatoes = scan.nextInt();
        System.out.println("To add cucumbers to salad enter number of gramms or either enter 0");
        cucumbers = scan.nextInt();
        salad.put(potato, potatoes);
        salad.put(eggplant, eggplants);
        salad.put(tomato, tomatoes);
        salad.put(cucumber, cucumbers);
        System.out.println("Salad is created!");
        return salad;
    }*/
//до этого момента все хорошо. как в добавлении удалении овощей суммировать в мапе новое кол-во ключа со старым?

    public Map<Vegetable, Integer> addVegetables(Vegetable vegetable) {
        //int potatoesnumber = salad.get(potato); почему я не могу взять по ключу значение из мапы, получается что беру объект?
        //соответственно не могу и просуммировать
        /*salad.get(eggplant);
        salad.get(tomato);
        salad.get(cucumber);
        System.out.println("To add potatoes to salad enter number of gramms or either enter 0");
        Scanner scan = new Scanner(System.in);
        potatoes = scan.nextInt();
        System.out.println("To add eggplants to salad enter number of gramms or either enter 0");
        eggplants = scan.nextInt();
        System.out.println("To add tomatoes to salad enter number of gramms or either enter 0");
        tomatoes = scan.nextInt();
        System.out.println("To add cucumbers to salad enter number of gramms or either enter 0");
        cucumbers = scan.nextInt();
        for (Map.Entry<Vegetable, Integer> entry : salad.entrySet()) {

        }
        salad.put(potato, potatoes);
        salad.put(eggplant, eggplants);
        salad.put(tomato, tomatoes);
        salad.put(cucumber, cucumbers);*/
        salad.put(vegetable, vegetable.getCalories());

        return salad;
    }

    public Map<Vegetable, Integer> removeVegetables(Vegetable vegetable) {
//тут не поняла - нужно в демоклассе прописывать овощ или с консоли вводить. И опять же та же беда с мапами. Тут был похожий код, но я его пока удалила

        return salad;

    }

    public void displaySaladIngridients() {
        for (Map.Entry<Vegetable, Integer> entry: getSalad().entrySet()) {
            System.out.println("");
        }
//тут должно быть выведено ингридиент и сколько его или просто какие овощи входят? просто у меня получается, что если не входит, то будет отображаться просто с кол-вом ноль
    }

    //до переопределения методов, сравнения, поиска и сортировки даже не дошла еще
    void sortVegetables() {

    }

    void findVegetables() {

    }

    void compareVegetables() {

    }


    public void sayHello() {
        System.out.println("Hello! Today we will cook salad");
    }

}
