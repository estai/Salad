package entity;

/**
 * Created by User on 01.11.14.
 */
public abstract class Ingredient {
    private String name;
    private double calories;

    public Ingredient(String name, double calories) {
        if(calories<0) throw new IllegalArgumentException("Can not be negative");
        this.name = name;
        this.calories = calories;

    }
    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     *
     * @return name
     */
    /**
     *
     * @param calories
     */
    public void setCalories(double calories) {
        this.calories = calories;
    }

    /**
     *
     * @return calories
     */

    public double getCalories() {
        return calories;
    }
    @Override
    public String toString(){
        return "name: "+name+"; calories: "+calories;
    }
}
