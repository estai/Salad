package entity;

import entity.Ingredient;

/**
 *  @author Boranov Yestay
 */
public class Vegetable extends Ingredient {
    private double weight;
    private String color;




    public Vegetable(String name,double calories) {
       super(name, calories);
    }

    public Vegetable(String name, double calories, double weight) {
        super(name, calories);
        if(weight<0) {throw new IllegalArgumentException("Can not be negative");}
        this.weight = weight;
    }

    public Vegetable(String name, double calories, double weight, String color) {
        super(name, calories);
        if(weight<0) {throw new IllegalArgumentException("Can not be negative");}
        this.weight = weight;
        this.color=color;
    }

    /**
     *
     * @param weight
     */
    public void setWeight(double weight) {
        if(weight<0) throw new IllegalArgumentException("Can not be negative");
        this.weight = weight;
    }
    /**
     *
     * @param weight
     */
    /**
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     *
     * @return color
     */
    @Override
    public String toString(){
       if(weight==0.0)
       return super.toString();
       return super.toString()+" weight "+weight;
   }
}
