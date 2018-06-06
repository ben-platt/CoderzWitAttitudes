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
    private boolean edible;

    //Constructor(s)
    public GuavaTree() {
      edible = false;
      alive = false;
      nutrients = 90;
      growRate = 1.45;
    }


    // METHODS
    //Accessor METHODS
    public boolean getAlive(){
      return alive;
    }
    public double getNutrients(){
      return nutrients;
    }

    public void photosynthesize(){
      nutrients = nutrients * growRate;
      //tbd
    }
    public boolean isEdible() {
      return edible;
    }



} // end of class
