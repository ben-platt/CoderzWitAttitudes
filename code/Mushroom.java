// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-08f

/*****************************************************
 * class Mushroom
 *****************************************************/

public  class Mushroom {

    // INSTANCE VARIABLES
    private boolean edible;
    private double nutrients;
    private double growRate;
    public String type = "plantFood";

    //Constructor(s)
    public Mushroom() {
	edible = true;
    }


    // METHODS
    //Accessor METHODS
    public double getNutrients(){
      return nutrients;
    }

    private void photosynthesize(){
      //tbd
    }

    public boolean isEdible() {
	return edible;
    }


} // end of class
