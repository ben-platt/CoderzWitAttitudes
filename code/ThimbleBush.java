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
    private double growRate;
    private GrowQueue berries;
    private boolean edible;

    //Constructor(s)
    public ThimbleBush() {
	     alive = true;
	     edible = false;
	     growRate = 3;
	     berries = new GrowQueue();
    }

    // METHODS
    //Accessor METHODS
    public boolean getAlive(){
      return alive;
    }
    public boolean isEdible() {
      return edible;
    }
    public String getName() {
	return "";
    }
    public String getType() {
	return "";
    }

    // grow
    public void photosynthesize(){
	int count = 0;
	while ( count < growRate ) {
	    int chance = (int) Math.random();
	    if ( chance == 0 ) {
		berries.grow( new Leaf() );
	    }
	    else {
		berries.grow( new ThimbleBerry() );
	    }
	}
    }

    public Item pluck() {
	berries.remove();
    }

} // end of class
