import java.util.ArrayList;
import java.util.List;


public class Salad {

    List<Ingredient> ingredients=new ArrayList<Ingredient>();
    public void clear(){ingredients.clear();}
    public void add(Ingredient ingredient){ingredients.add(ingredient);}
    public void remove(Ingredient ingredient){ingredients.remove(ingredient);}

    public void display() {
        for (Ingredient ingredient : ingredients) {
            System.out.println(ingredient.toString());
        }
    }


     public double getTotalCalories(){
         double result=0.0;
         for(Ingredient ingredient:ingredients)
         {
             result+=ingredient.getCalories();
         }
         return result;
     }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
