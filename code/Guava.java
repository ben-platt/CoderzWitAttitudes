// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-08f

/*****************************************************
 * class Guava
 *****************************************************/

public class Guava extends Item {

    // INSTANCE VARIABLES
    private double nutrients;
    private boolean edible;
    private String type = "plantFood";
    private String name = "Guava";

    //Constructor(s)
    public Guava() {
      edible = true;
      nutrients = 60;
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
