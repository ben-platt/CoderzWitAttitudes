// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-08f

/*****************************************************
* class Catfish
*****************************************************/

public class Catfish extends Fish{


  // INSTANCE VARIABLES
  private double nutrients;
  private double life;

  private final double power = 0.4; //Power on scale of 0.0-0.5
  public String type = "animalFood";

  // CONSTRUCTOR(S)
  public Catfish(){
    nutrients = 40;
    life = 100;
  }

  public Catfish(double n, double l){
    nutrients = n;
    life = l;
  }

  // METHODS
  //Attack method
  public void attack(Player p){
    double magnitude = life * power;
    p.setHealth(p.getHealth()-magnitude);
    System.out.println("The catfish caught your leg! It's bleeding! ");
  }

  public String toString(){
    return "Catfish: \n Nutrients: "+ nutrients;
  }

} // end of class
