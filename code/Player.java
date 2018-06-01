// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-01f

/*****************************************************
 * class Player
 *****************************************************/

import java.util.Stack;
import java.util.Queue;

public class Player {

    // INSTANCE VARIABLES
    private int age;
    private double height;
    private double weight;
    private double life;
    private double health;
    private double maxNutri;
    private ItemQueue<Object> items;
    private Stack<Plant> plants;
    private Stack<Animal> animals;

    // CONSTRUCTOR(S)
    //Default constructor
    public Player() {
	age = 17;
	height = 65.0;
	weight = 108.0;
	life = 42.0;
  maxNutri = ((108/2.2) / (Math.pow((height/2.54), 2))) * age; //this is BMI * age
    }

    //PUt another construcotr based on user input later
    // Maybe we can just use these mutator methods for user input

    // METHODS

    //Accessor methods
    public int getAge(){
	return age;
    }
    public double getHeight(){
	return height;
    }
    public double getWeight(){
	return weight;
    }
    public double getLife(){
	return life;
    }
    public double getMaxNutri(){
      return maxNutri;
    }
    public Plant getPlant(){
	return plants.peek();
    }
    public Animal getAnimal(){
	return animals.peek();
    }
    public ItemQueue<Object> getItems(){
	return items;
    }

    // Mutator Methods
    public void setAge( int inputAge ){
        age = inputAge;
    }
    public void setHeight( double inputHeight ){
	height = (double) inputHeight;
    }
    public void setWeight( double inputWeight ){
	weight = (double) inputWeight;
    }
    private void setLife( double inputLife ){
	life = inputLife;
    }

    // Items
    public void addItem( Object inputItem ) {
	items.enqueue( inputItem );
    }

    // Eating methods
    public void eatAnimal(){
      Animal current = animals.pop();
      if(current instanceof Frog){
        health += current.getNutrients();
      }
      else if(current 
      //add more specifics later; how to increase nutrition and health
      //decide on values for each individual animal
    }

} // end of class
