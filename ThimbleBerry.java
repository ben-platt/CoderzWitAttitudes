// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-08f

/*****************************************************
 * class ThimbleBerry
 *****************************************************/

public class ThimbleBerry extends Item {

    // INSTANCE VARIABLES
    private boolean edible;
    private double nutrients;
    private String type = "plantFood";
    private String name = "ThimbleBerry";

    //Constructor(s)
    public ThimbleBerry() {
	edible = true;
	nutrients = 20.0;
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
	return nutrients;
    }

} // end of class
