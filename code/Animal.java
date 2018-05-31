// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-01f

/*****************************************************
 * class Animal
 *****************************************************/

public abstract class Animal {

    // INSTANCE VARIABLES
    private double nutrients;
    private double life;

    // METHODS
    //Accessor Methods
    public double getNutrients(){
      return nutrients;
    }

    public double getLife(){
      return life;
    }

    //Attack method
    public abstract void attack();
    protected abstract void eat();

} // end of class
