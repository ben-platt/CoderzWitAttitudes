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
    private double health;
    private double maxNutri;
    private LinkedList items;
    private LinkedList fishnet;

    // CONSTRUCTOR(S)
    //Default constructor
    public Player() {
	age = 17;
	height = 65.0;
	weight = 108.0;
	health = 100;
  maxNutri = ((108/2.2) / (Math.pow((height/2.54), 2))) * age; //this is BMI * age
    }

    public Player(int a, double h, double w, double heal){
	age = a;
	height = h;
	weight = w;
	health = heal;
    }
    
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
    public double getHealth(){
	return health;
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
    private void setHealth( double inputHealth ){
	health = inputHealth;
    }

    // Items
    public void addItem( Object inputItem ) {
	items.enqueue( inputItem );
    }

    // Eating methods
    public void eatAnimal(){
      Animal current = animals.peek();
      
      if(current instanceof Fugu){
	  if(current.chanceofSurvival()){
	      animals.pop();
	      health += current.getNutrients();
	  }
	  else{
	      System.out.println("You died from consuming the poisonous fugu");
	      health = 0;
	  }
      }
      
      else if(health + current.getNutrients() > maxNutri){
        System.out.println("You are full! Eat later.");
      }
      else{
        animals.pop();
        health += current.getNutrients();
      }
    }

    //Attack methods
    public double attack(Animal prey){
	
    }

    private void fish(){
	int index = (int)( Math.random() * 2);
	if(index == 0){
	    fishnet.add(new Fugu());
	}
	else if (index == 1){
	    fishnet.add(new Tuna());
	}
	else{
	    fishnet.add(new Catfish());
	}
    }

    //CHeck vicinity mehtod prints message, then determines who to attack
} // end of class
