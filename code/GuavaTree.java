// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-08f

/*****************************************************
 * class GuavaTree
 *****************************************************/

public  class GuavaTree extends Tree {

    // INSTANCE VARIABLES
    private boolean alive;
    private double nutrients;
    private double growRate;

    //Constructor(s)
    public GuavaTree() {
      alive = false;
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
      //tbd
    }
    public boolean isEdible() {
      return edible;
    }



} // end of class
