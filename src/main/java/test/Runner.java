package test;

import actions.Actions;
import cook.ChiefCook;
import salad.Salad;

/**
 *  @author Boranov Yestay
 *
 */
public class Runner {
    public static void main(String[] args) {
        ChiefCook cook=new ChiefCook("Yestay");
        Salad salad=cook.createSalad(5,8,2);
        Actions.display(salad);
        System.out.println("-----------------");
        System.out.println(cook.getTotalCalories(salad));
        System.out.println("-----------------");
        Actions.display(cook.vegetableSearchByCalories(salad,15,150));
        System.out.println("-----------------");
        Actions.display(Actions.sortByCalories(salad));
    }


}
