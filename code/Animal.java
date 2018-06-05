// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-08f

/*****************************************************
 * class Animal
 *****************************************************/

public abstract class Animal {

    // INSTANCE VARIABLES
    private double nutrients;
    private double life;


    // METHODS
    //Accessor Methods
    public double getNutrients(){
      return nutrients;
    }

    public double getLife(){
      return life;
    }

    //Mutator Methods
    public void setNutrients(double n){
	nutrients = n;
    }

    public void setLife(double n){
	life = n;
    }

    //Attack method
    public abstract void attack(Player p);

} // end of class
