// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-08f

/*****************************************************
 * class Petunia
 *****************************************************/

public class Petunia extends Plant {

    // INSTANCE VARIABLES
    private boolean alive;
    private double nutrients;
    private double growRate;
    private boolean edible;
    private String type = "plant";
    private String name = "Petunia";

    //Constructor(s)
    public Petunia() {
      alive = false;
      edible = false;
      nutrients = 70;
      growRate = 1.16;
    }


    // METHODS
    //Accessor METHODS
    public boolean isEdible() {
      return edible;
    }
    public boolean getAlive(){
      return alive;
    }
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
    //to be implemented
    }

} // end of class
