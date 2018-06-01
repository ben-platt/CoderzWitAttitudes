// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-08f

/*****************************************************
 * class Frog
 *****************************************************/

public class Frog extends Animal{

    private final double power = 0.05; //Power on scale of 0.0-0.5
    

    // CONSTRUCTOR(S)
    public Frog(){
	nutrients = 50;
	life = 100;
    }

    public Frog(double n, double l){
	nutrients = n;
	life = l;
    }

    // METHODS
    //Attack method
    public void attack(Player p){
	double magnitude = life * power;
	p.setLife(p.getLife()-magnitude);
	System.out.println("The frog has hippity-hopped on to your face; You can't see! ");
    }

} // end of class
