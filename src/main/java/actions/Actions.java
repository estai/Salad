package actions;


import entity.Ingredient;
import entity.Vegetable;
import salad.Salad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Boranov Yestay
 */
public class Actions {

    public static void display(List<Vegetable> vegetables){
        for (Vegetable vegetable : vegetables) {
            System.out.println(vegetable.toString());
        }

    }
    public static void display(Salad salad) {

        for (Ingredient ingredient : salad.getIngredients()) {
            System.out.println(ingredient.toString());
        }
    }
   public static List<Vegetable> sortByCalories(Salad salad){
       System.out.println("sort vegetables by calories");
       List<Vegetable> vegetables=salad.getVegetables();
       Collections.sort(vegetables, new Comparator<Vegetable>() {
           @Override
           public int compare(Vegetable o1, Vegetable o2) {
               return Double.compare(o1.getCalories(),o2.getCalories());
           }
       });
       return vegetables;
   }

}
