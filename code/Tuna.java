// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-01f

/*****************************************************
* class Tuna
*****************************************************/

public class Tuna extends Fish{


  // INSTANCE VARIABLES
  private double nutrients;
  private double life;

  private final double power = 0.1; //Power on scale of 0.0-0.5
  public String type = "animalFood";


  // CONSTRUCTOR(S)
  public Tuna(){
    nutrients = 40;
    life = 100;
  }

  public Tuna(double n, double l){
    nutrients = n;
    life = l;
  }

  // METHODS
  public double getPower(){
    return power;
  }
  //Attack method
  public void attack(Player p){
    double magnitude = life * power;
    p.setHealth(p.getHealth()-magnitude);
    System.out.println("You got done gulped by the tuna!  ");
  }

  public String toString(){
    return "Tuna: \n Nutrients: "+ nutrients;
  }

} // end of class
