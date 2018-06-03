// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-01f

/*****************************************************
 * class Fugu
 *****************************************************/

public class Fugu extends Fish{

      private final double power = 0.3; //Power on scale of 0.0-0.5


      // CONSTRUCTOR(S)
      public Fugu(){
  	nutrients = 50;
  	life = 100;
      }

      public Fugu(double n, double l){
  	nutrients = n;
  	life = l;
      }

      // METHODS
      //Attack method
      public void attack(Player p){
  	double magnitude = life * power;
  	p.setLife(p.getLife()-magnitude);
  	System.out.println("You touched the poisonous fugu fish spikes!  ");
      }



} // end of class
