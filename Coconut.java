// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-08f

/*****************************************************
 * class Coconut
 *****************************************************/

public  class Coconut extends Item {

    // INSTANCE VARIABLES
    private double nutrients;
    private boolean edible;
    private String type = "plantFood";
    private String name = "Coconut";

    
    //Constructor(s)
    public Coconut() {
      edible = true;
      nutrients = 70;
    }

    // METHODS
    //Accessor METHODS
    public double getNutrients(){
      return nutrients;
    }
    public boolean isEdible() {
      return edible;
    }
    public String getName() {
	return name;
    }
    public String getType() {
	return type;
    }

    
} // end of class
