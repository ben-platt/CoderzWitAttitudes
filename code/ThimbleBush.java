// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-08f

/*****************************************************
 * class ThimbleBush
 *****************************************************/
import java.util.Queue;

public class ThimbleBush extends Plant {

    // INSTANCE VARIABLES
    private boolean alive;
    private double nutrients;
    private double growRate;
    private Queue<ThimbleBerry> berries;

    //Constructor(s)
    public ThimbleBush() {
	     alive = false;
	     edible = false;
    }


    }

    // METHODS
    //Accessor METHODS
    public boolean getAlive(){
      return alive;
    }
    public double getNutrients(){
      return nutrients;
    }

    private void photosynthesize(){
    }
    public boolean isEdible() {
      return edible;
    }


} // end of class
