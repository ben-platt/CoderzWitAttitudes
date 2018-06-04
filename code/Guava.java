// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-08f

/*****************************************************
 * class Guava
 *****************************************************/

public  class Guava {

    // INSTANCE VARIABLES
    private double nutrients;
    private boolean edible;
    public String type = "plantFood";

    //Constructor(s)
    public Guava() {
	edible = true;
    }

    // METHODS
    //Accessor METHODS
    public double getNutrients(){
      return nutrients;
    }

    public boolean isEdible() {
	return edible;
    }

    
} // end of class
