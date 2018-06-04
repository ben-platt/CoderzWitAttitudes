// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-01f

/*****************************************************
 * class Turkey
 *****************************************************/

public class Turkey extends Animal{

      // INSTANCE VARIABLES
      private double nutrients;
      private double life;

    private final double power = 0.2; //Power on scale of 0.0-0.5
    public String type = "animalFood";

    // CONSTRUCTOR(S)
    public Turkey(){
  	nutrients = 90;
  	life = 100;
    }

    public Turkey(double n, double l){
  	nutrients = n;
  	life = l;
    }

    // METHODS
    //Attack method
    public void attack(Player p){
  	double magnitude = life * power;
  	p.setHealth(p.getHealth()-magnitude);
  	System.out.println("The turkey is gobbling over you!");
    }



} // end of class
