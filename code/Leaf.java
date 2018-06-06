// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-08f

/*****************************************************
 * class Leaf
 *****************************************************/

public class Leaf extends Plant {

    // INSTANCE VARIABLES
    private boolean edible;
    public String type = "plant";
    public String name = "Leaf";

    //Constructor(s)
    public Leaf() {
      edible = false;
    }


    // METHODS
    public boolean isEdible() {
      return edible;
    }
    public void photosynthesize() {
    }
    
} // end of class
