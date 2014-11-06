package entity;

/**
 *  @author Boranov Yestay
 */
public class Flovoring extends Ingredient {
    private boolean isSharp;


    public Flovoring(String name, double calories, boolean isSharp) {
        super(name, calories);
        this.isSharp = isSharp;
    }

    public Flovoring(String name, double calories) {
        super(name, calories);
    }
    /**
     *
     * @param isSharp
     */
    public void setSharp(boolean isSharp) {
        this.isSharp = isSharp;
    }
    /**
     *
     * @return  isSharp
     */

    @Override
    public String toString(){
        if(isSharp==true)
            return super.toString()+"; sharp";
        return super.toString()+"; not sharp";
    }
}

