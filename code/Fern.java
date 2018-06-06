// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-08f

/*****************************************************
 * class Fern
 *****************************************************/

public  class Fern extends Plant {

    // INSTANCE VARIABLES
    private boolean edible;
    private double nutrients;
    private double growRate;
    public String type = "plantFood";
    public String name = "Fern";

    //Constructor(s)
    public Fern() {
      edible = true;
      nutrients = 10;
      growRate = 1.01;
    }


    // METHODS
    //Accessor METHODS
    public double getNutrients(){
      return nutrients;
    }

    public void photosynthesize(){
      nutrients = nutrients * growRate;
      //tbd
    }

    public boolean isEdible() {
      return edible;
    }


} // end of class
