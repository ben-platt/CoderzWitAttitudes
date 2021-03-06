// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-08f

/*****************************************************
* class Frog
*****************************************************/

public class Frog extends Animal{

  // INSTANCE VARIABLES
  private double nutrients;
  private double life;
  private int xcor = (int) (Math.random() * 100);
  private int ycor = (int) (Math.random() * 100);

  private final double power = 0.05; //Power on scale of 0.0-0.5
  private String type = "animalFood";
  private String name = "Frog";

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
    System.out.println("The frog has hippity-hopped on to your face; You can't see! ");
  }

  public String toString(){
    return "Frog: \n Nutrients: "+ nutrients;
  }

} // end of class
