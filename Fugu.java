// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-01f

/*****************************************************
* class Fugu
*****************************************************/

public class Fugu extends Fish{


  // INSTANCE VARIABLES
  private double nutrients;
  private double life;

  private final double power = 0.3; //Power on scale of 0.0-0.5
  private String type = "animalFood";
    private String name = "Fugu";

  // CONSTRUCTOR(S)
  public Fugu(){
    nutrients = 30;
    life = 100;
  }

  public Fugu(double n, double l){
    nutrients = n;
    life = l;
  }

  // METHODS
  public double getPower(){
    return power;
  }
    public String getName() {
	return name;
    }
    public String getType() {
	return type;
    }
  
  //Attack method
  public void attack(Player p){
    double magnitude = life * power;
    p.setHealth(p.getHealth()-magnitude);
    System.out.println("You touched the poisonous fugu fish spikes!  ");
  }

  //Chance of edible
  public boolean chanceofSurvival(){
    double rand = Math.random();
    if(rand <= 0.05){
      return true;
    }
    return false;
  }

  public String toString(){
    return "Catfish: \n Nutrients: "+ nutrients;
  }

} // end of class
