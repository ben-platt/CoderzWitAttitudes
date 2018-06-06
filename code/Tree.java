// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-08f

/*****************************************************
 * class Tree
 *****************************************************/

public class Tree extends Plant {

    // INSTANCE VARIABLES

    private boolean alive;
    private double nutrients;
    private double growRate;
    private boolean edible;
    //Constructor(s)
    public Tree() {
	     edible = false;
    }


    // METHODS

    //Accessor METHODS
    public boolean getAlive(){
      return alive;
    }
    public double getNutrients(){
      return nutrients;
    }
    private void photosynthesize(){
    }
//to be continued

public boolean isEdible() {
      return edible;
    }

} // end of class
