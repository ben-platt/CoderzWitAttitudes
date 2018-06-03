// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-01f

/*****************************************************
 * class WildBoar
 *****************************************************/

public class WildBoar extends Animal{

      private final double power = 0.5; //Power on scale of 0.0-0.5


      // CONSTRUCTOR(S)
      public WildBoar(){
  	nutrients = 95;
  	life = 100;
      }

      public WildBoar(double n, double l){
  	nutrients = n;
  	life = l;
      }

      // METHODS
      //Attack method
      public void attack(Player p){
  	double magnitude = life * power;
  	p.setLife(p.getLife()-magnitude);
  	System.out.println("The wild boar is attacking you! ");
      }

} // end of class
