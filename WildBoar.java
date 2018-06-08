// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-01f

/*****************************************************
* class WildBoar
*****************************************************/

public class WildBoar extends Animal{

  // INSTANCE VARIABLES
  private double nutrients;
  private double life;
  private int xcor = (int) (Math.random() * 100);
  private int ycor = (int) (Math.random() * 100);

  private final double power = 0.5; //Power on scale of 0.0-0.5
  private String type = "animalFood";
  private String name = "WildBoar";


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
    System.out.println("The wild boar is goring you! ");
  }

  public String toString(){
    return "WildBoar: \n Nutrients: "+ nutrients;
  }

} // end of class
