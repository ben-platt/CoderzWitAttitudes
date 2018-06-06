// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-08f

/*****************************************************
 * class PalmTree
 *****************************************************/

public class PalmTree extends Tree {

    // INSTANCE VARIABLES
    private boolean alive;
    private double nutrients;
    private double growRate;
	private boolean edible;
    
    //Constructor(s)
    public PalmTree() {
	     edible = false;
	     nutrients = 80;
	     growRate = 1.4;
    }


    // METHODS
    //Accessor METHODS
    public boolean isEdible() {
      return edible;
    }
    public boolean getAlive(){
      return alive;
    }
    public double getNutrients(){
      return nutrients;
    }

    public void photosynthesize(){
      nutrients = nutrients * growRate;
      //to be conitnued
    }

} // end of class
