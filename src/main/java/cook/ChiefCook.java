package cook;

import entity.Ingredient;
import entity.Vegetable;
import factory.Refrigerator;
import salad.Salad;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 *  @author Boranov Yestay
 *
 * */
public class ChiefCook {
    private String name;

    public ChiefCook(String name) {
        this.name = name;
    }


    public Salad createSalad(final int NUMBER_INGREDIENT,int maxVeg,int maxFlov) {

        Salad salad = new Salad();
        List<Ingredient> ingredients=new ArrayList<Ingredient>();
        List<Vegetable> vegetables=new ArrayList<Vegetable>();
        for (int i = 0; i <NUMBER_INGREDIENT; i++) {
            int mode = new Random().nextInt(maxVeg);
            ingredients.add(Refrigerator.getVegetable(mode));
            vegetables.add(Refrigerator.getVegetable(mode));
        }

        ingredients.add(Refrigerator.getFlovoring(new Random().nextInt(maxFlov)));
        salad.setIngredients(ingredients);
        salad.setVegetables(vegetables);
        return salad;
    }


    public List<Vegetable> vegetableSearchByCalories (Salad salad,double min,double max){
        System.out.println("Search vegetable by calories ("+min+","+max+")");
         List<Vegetable> vegetables=new ArrayList<Vegetable>();
        for (Vegetable vegetable:salad.getVegetables()) {
             if(vegetable.getCalories()>=min && vegetable.getCalories()<=max)
                 vegetables.add(vegetable);
         }
        if (vegetables.isEmpty()) System.out.println("There is no vegetable that's suitable for your request");
         return vegetables;
     }
         public double getTotalCalories(Salad salad){
             double result=0.0;
             for (Ingredient ingredient:salad.getIngredients())
             { result+=ingredient.getCalories();}
             return result;
         }
    public void setName(String name) {
        this.name = name;}
}
