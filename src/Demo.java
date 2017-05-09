/**
 * Created by Marinka on 05.05.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Chief hulio = new Chief();
        Potato potato = new Potato(12);
        Cucumber cucumber = new Cucumber("sring", 67);
        hulio.sayHello();
        hulio.addVegetables(potato);
        hulio.displaySaladIngridients();
        hulio.addVegetables(cucumber);
        System.out.println(hulio.salad);
        //Hulio.createSalad();
        //Hulio.removeVegetables();
        hulio.displaySaladIngridients();
    }
}