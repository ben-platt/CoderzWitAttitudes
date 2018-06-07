// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-08f

/*****************************************************
 * class PalmTree
 *****************************************************/

public class PalmTree extends Tree {

    // INSTANCE VARIABLES
    private boolean alive;
    private double growRate;
    private boolean edible;
    private GrowQueue coconuts;
    
    //Constructor(s)
    public PalmTree() {
	edible = false;
	growRate = 3;
	coconuts = new GrowQueue();
    }

    // METHODS
    //Accessor METHODS
    public boolean isEdible() {
      return edible;
    }
    public boolean getAlive(){
      return alive;
    }

    // grow
    public void photosynthesize(){
	int count = 0;
	while ( count < growRate ) {
	    double chance = Math.random() * 2;
	    System.out.println( chance );
	    if ( chance < 1 ) {
		coconuts.grow( new PalmLeaf() );
	    }
	    else {
		coconuts.grow( new Coconut() );
	    }
	    count++;
	}
    }

    public Item pluck() {
	System.out.println( "It's a " + coconuts.peekFront().getName() + "!");
	return coconuts.remove();
    }

    /* MAIN METHOD
    public String toString() {
	String returned = "";
	for ( int i = 0; i < coconuts.getQueue().size(); i++ ) {
	    returned += coconuts.getQueue().get(i).getName() + "-";
	}
	return returned;
    }

    public static void main( String[] args ) {
	PalmTree coco = new PalmTree();
	coco.photosynthesize();
	System.out.println( coco.toString() );
	coco.pluck();
	System.out.println( coco.toString() );
	coco.pluck();
	System.out.println( coco.toString() );
	coco.pluck();
	System.out.println( coco.toString() );
	
    }

    */ // end of Main Method

} // end of class
