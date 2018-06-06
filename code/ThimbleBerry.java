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
    public String type = "plantFood";
    public String name = "ThimbleBerry";

    //Constructor(s)
    public ThimbleBerry() {
	     edible = true;
    }


    // METHODS
    public boolean isEdible() {
	return edible;
    }

} // end of class
