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
    public String type = "plant";
    public String name = "PalmLeaf";

    //Constructor(s)
    public PalmLeaf() {
	edible = false;
    }


    // METHODS
    public boolean isEdible() {
	return edible;
    }
    
} // end of class
