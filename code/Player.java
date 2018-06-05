// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-01f

/*****************************************************
* class Player
*****************************************************/

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Player {

  // INSTANCE VARIABLES
  private int age;
  private double height;
  private double weight;
  private double health;
  private double maxNutri;
  private ItemList<Object> items;
  private int xcor;
  private int ycor;

  private Island island;

  // CONSTRUCTOR(S)
  //Default constructor
  public Player() {
    age = 17;
    height = 65.0;
    weight = 108.0;
    health = 100;
    maxNutri = ((108/2.2) / (Math.pow((height/2.54), 2))) * age; //this is BMI * age
    island = new Island();
    xcor = 0;
    ycor = 0;
  }

  public Player(int a, double h, double w, double heal){
    age = a;
    height = h;
    weight = w;
    health = heal;
    island = new Island();
    xcor = 0;
    ycor = 0;
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
  public LinkedList<Object> getItems(){
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
  public void setHealth( double inputHealth ){
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
  public double attack(){
    int target = checkVicinity();
    Animal prey = island.getAnimals().get(target);
    island.removeAnimal();
    

  }

  private int checkVicinity(){
    ArrayList<Animal> tmp = island.getAnimals();
    Animal tar;
    double min = distance(xcor, ycor, tmp.get(0).getXcor(), tmp.get(0).getYcor());
    int index = -1;
    for(Animal a: tmp){
      double current = distance(xcor, ycor, a.getXcor(), a.getYcor());
      if (current < min){
        tar = a;
        min = current;
      }
      index++;
    }
    return index;
  }

  private double distance(int x1, int y1, int x2, int y2){
    return (Math.sqrt(((x1-x2)*(x1-x2)) + ((y1-y2)*(y1-y2))));
  }
  private void fish(){


  }

} // end of class
