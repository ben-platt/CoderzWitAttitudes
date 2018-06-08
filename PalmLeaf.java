// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-08f

/*****************************************************
 * class PalmLeaf
 *****************************************************/

public class PalmLeaf extends Plant {

    // INSTANCE VARIABLES
    private boolean edible;
    private String type = "plant";
    private String name = "PalmLeaf";

    //Constructor(s)
    public PalmLeaf() {
      edible = false;
    }


    // METHODS
    public boolean isEdible() {
      return edible;
    }
    public String getName() {
	return name;
    }
    public String getType() {
	return type;
    }
    
    public void photosynthesize() {
    }
    
} // end of class
