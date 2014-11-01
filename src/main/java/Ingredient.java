/**
 * Created by User on 01.11.14.
 */
public abstract class Ingredient {
    private String name;
    private double calories;
    private String color;

    public void setName(String name) {
        this.name = name;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCalories() {
        return calories;
    }
    public String toString(){
        return "name: "+name;
    }
}
