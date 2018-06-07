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
    private String type = "plant";
    private String name = "Leaf";

    //Constructor(s)
    public Leaf() {
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
