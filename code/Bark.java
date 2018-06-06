// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-08f

/*****************************************************
 * class Bark
 *****************************************************/

public class Bark extends Item {

    // INSTANCE VARIABLES
    private boolean edible;
    public String type = "plant";
    public String name = "Bark";

    //Constructor(s)
    public Bark() {
      edible = false;
    }

    // METHODS
    public boolean isEdible() {
      return edible;
    }
    
} // end of class
