package factory;

import entity.Flovoring;
import entity.Vegetable;

/**
 *  @author Boranov Yestay
 */
public class Refrigerator {
    public static Vegetable getVegetable(int ing){

        switch (ing){
            case 0: return new Vegetable("Carrot", 100.5);
            case 1:return new Vegetable("Cabbage", 115.5);
            case 2:return new Vegetable("Eggplant",180.5);
            case 3:return new Vegetable("Potatoes",125.5);
            case 4:return new Vegetable("Beet",95.5);
            case 5:return new Vegetable("Cucumber",120);
            case 6:return new Vegetable("Tomato",110.2);
            case 7:return  new Vegetable("Radish",55.5);
            default: throw new IllegalArgumentException("illegal mode");
        }

    }
    public static Flovoring getFlovoring(int ing)
    {
        switch (ing){
            case 0:return new Flovoring("Mayonnaise",125.5,false);
            case 1:return new Flovoring("Butter",125.5,false);
            default: throw new IllegalArgumentException("illegal mode");
        }
    }
}
