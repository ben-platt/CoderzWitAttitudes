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
	     growRate = 6;
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
	return "ThimbleBush";
    }
    public String getType() {
	return "";
    }
    public GrowQueue getQueue() {
	return berries;
    }

    // grow
    public void photosynthesize(){
	int count = 0;
	while ( count < growRate ) {
	    double chance = Math.random() * 2;
	    if ( chance < 1 ) {
		berries.grow( new Leaf() );
	    }
	    else {
		berries.grow( new ThimbleBerry() );
	    }
	    count++;
	}
    }

    public Item pluck() {
	System.out.println( "It's a " + berries.peekFront().getName() + "!");
	return berries.remove();
    }

    /* MAIN METHOD

       public String toString() {
       String returned = "";
       for ( int i = 0; i < berries.getQueue().size(); i++ ) {
       returned += berries.getQueue().get(i).getName() + "-";
       }
       return returned;
       }

       public static void main( String[] args ) {
       ThimbleBush bush = new ThimbleBush();
       bush.photosynthesize();
       System.out.println( bush.toString() );
       bush.pluck();
       System.out.println( bush.toString() );
       bush.pluck();
       System.out.println( bush.toString() );
       bush.pluck();
       System.out.println( bush.toString() );

       }

    */ // end of Main Method

} // end of class
