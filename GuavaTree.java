// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-08f

/*****************************************************
 * class GuavaTree
 *****************************************************/

public  class GuavaTree extends Tree {

    // INSTANCE VARIABLES
    private boolean alive;
    private double nutrients;
    private double growRate;
    private boolean edible;
    private GrowQueue guavas;

    //Constructor(s)
    public GuavaTree() {
      edible = false;
      alive = false;
      growRate = 4;
      guavas = new GrowQueue();
    }


    // METHODS
    //Accessor METHODS
    public boolean getAlive(){
      return alive;
    }
    public double getNutrients(){
      return nutrients;
    }
    public boolean isEdible() {
      return edible;
    }

    public String getName(){
      return "GuavaTree";
    }


    // grow
    public void photosynthesize(){
	int count = 0;
	while ( count < growRate ) {
	    double chance = Math.random() * 2;
	    if ( chance < 1 ) {
		guavas.grow( new Leaf() );
	    }
	    else {
		guavas.grow( new Guava() );
	    }
	    count++;
	}
    }

    public Item pluck() {
	System.out.println( "It's a " + guavas.peekFront().getName() + "!");
	return guavas.remove();
    }

    /* MAIN METHOD

    public String toString() {
	String returned = "";
	for ( int i = 0; i < guavas.getQueue().size(); i++ ) {
	    returned += guavas.getQueue().get(i).getName() + "-";
	}
	return returned;
    }

    public static void main( String[] args ) {
	GuavaTree guav = new GuavaTree();
	guav.photosynthesize();
	System.out.println( guav.toString() );
	guav.pluck();
	System.out.println( guav.toString() );
	guav.pluck();
	System.out.println( guav.toString() );
	guav.pluck();
	System.out.println( guav.toString() );

    }

    */ // end of Main Method

} // end of class
