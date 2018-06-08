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
    private String type = "plant";
    private String name = "Bark";

    //Constructor(s)
    public Bark() {
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
    public double getNutrients() {
	return 0.0;
    }
    
} // end of class
