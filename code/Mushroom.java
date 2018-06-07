// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-08f

/*****************************************************
 * class Mushroom
 *****************************************************/

public class Mushroom extends Plant {

    // INSTANCE VARIABLES
    private boolean edible;
    private double nutrients;
    private double growRate;
    private String type = "plantFood";
    private String name = "Mushroom";

    //Constructor(s)
    public Mushroom() {
      nutrients = 25;
      growRate = 1.25;
      edible = true;
    }


    // METHODS
    //Accessor METHODS
    public double getNutrients(){
      return nutrients;
    }
    public String getName() {
	return name;
    }
    public String getType() {
	return type;
    }

    public void photosynthesize(){
      nutrients = nutrients * growRate;
      //tbd
    }

    public boolean isEdible() {
      return edible;
    }


} // end of class
