// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-08f

/*****************************************************
 * class Tree
 *****************************************************/

public class Tree extends Plant {

    // INSTANCE VARIABLES

    private boolean alive;
    private double growRate;
    private boolean edible;
    private GrowQueue leaves;

    //Constructor(s)
    public Tree() {
	edible = false;
	growRate = 10;
	leaves = new GrowQueue();
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
	return "Tree";
    }
    public String getType() {
	return "";
    }

    // grow
    public void photosynthesize(){
	int count = 0;
	while ( count < growRate ) {
	    leaves.grow( new Leaf() );
	    count++;
	}

    }
    public Item pluck() {
	System.out.println( "It's a " + leaves.peekFront().getName() + "!");
	return leaves.remove();
    }

} // end of class
