// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-08f

/*****************************************************
 * abstract class Plant
 *****************************************************/

public abstract class Plant {

    // INSTANCE VARIABLES
    private boolean alive;
    private double nutrients;
    private double growRate;

    // METHODS
    //Accessor METHODS
    public boolean getAlive(){
      return alive;
    }
    public double getNutrients(){
      return nutrients;
    }
    public setNutrients(double nutt) {
	nutrients = nutt;
    }

    //abstract methods
    public void setNutrients( double inputNutrients ) {
	nutrients = inputNutrients;
    }
    
    protected abstract void photosynthesize(); //specific to each type of plants

} // end of class
