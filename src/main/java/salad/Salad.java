package salad;

import entity.Ingredient;
import entity.Vegetable;

import java.util.ArrayList;
import java.util.List;
/**
 *  @author Boranov Yestay
 * */

public class Salad {
    private List<Vegetable> vegetables=new ArrayList<Vegetable>();
    private List<Ingredient> ingredients=new ArrayList<Ingredient>();
    public void clear(){ingredients.clear();}
    public void add(Ingredient ingredient){ingredients.add(ingredient);}
    public void remove(Ingredient ingredient){ingredients.remove(ingredient);}


    public List<Ingredient> getIngredients() {
        if(ingredients.isEmpty()) System.out.println("Salad not created");
        return ingredients;
    }


    public void setVegetables(List<Vegetable> vegetables) {
        this.vegetables = vegetables;
    }

    public List<Vegetable> getVegetables() {
        return vegetables;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
