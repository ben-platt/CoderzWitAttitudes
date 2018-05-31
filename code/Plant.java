// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-01f

/*****************************************************
 * class Plant
 *****************************************************/

public abstract class Plant {

    // INSTANCE VARIABLES
    private boolean alive;
    private double nutrients;

    // CONSTRUCTOR(S)


    // METHODS
    //Accessor METHODS
    public boolean getAlive(){
      return alive;
    }
    public double getNutrients(){
      return nutrients;
    }

    public abstract void photosynthesize(); //specific to each type of plants


} // end of class
