/**
 * Created by User on 01.11.14.
 */
public class Runner {
    public static void main(String[] args) {
        ChiefCook cook=new ChiefCook("Estai");
        Salad salad=cook.createSalad("olivie");
        salad.display();
        System.out.println(salad.getTotalCalories());

    }


}
