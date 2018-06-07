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
import java.util.ArrayList;
import java.util.Scanner;

public class Player {

  // INSTANCE VARIABLES
  private int age;
  private double height;
  private double weight;
  private double health;
  private double maxNutri;
  private ItemList items;
  private int xcor;
  private int ycor;
  private boolean hasShelter;

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
    items = new ItemList();
    hasShelter = false;
  }

  public Player(int a, double h, double w, double heal){
    age = a;
    height = h;
    weight = w;
    health = heal;
    island = new Island();
    xcor = 0;
    ycor = 0;
    items = new ItemList();
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

  public void getPlantFood(){
    ItemNode currentItem = items._start;
    String listplants = "";
    int num = 1;
    while( currentItem != null){
      if( currentItem.getItemType() == "plantFood"){
        listplants += num + currentItem.getContents() + "/n";
      }
      currentItem = currentItem.getNext();
      num++;
    }
    System.out.println(listplants);
  }

  public void getAnimalFood(){
    ItemNode currentItem = items._start;
    String listanimals = "";
    int num = 1;
    while( currentItem != null){
      if( currentItem.getItemType() == "animalFood"){
        listplants += num + currentItem.getContents() + "/n";
      }
      currentItem = currentItem.getNext();
      num++;
    }
    System.out.println(listplants);
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
  public void addItem( Item inputItem ) {
    items.add(inputItem);
  }

  public void removeItem(Item inputItem){
    items.remove(inputItem);
  }

  public void buildShelter()
  // Eating methods :FIX THIS METHOD BASED ON DOUBLY LINKED LIST
  public void eatAnimal(Animal a){
    ItemNode currentItem = items._start;
    while(currentItem.getContents() != a.getName()){
      currentItem = currentItem.getNext();
    }
    if(a instanceof Fugu){
      if(((Fugu) a).chanceofSurvival()){
        items.remove(a);
        health += a.getNutrients();
      }
      else{
        System.out.println("You died from consuming the poisonous fugu");
        health = 0;
      }
    }
    else if(health + a.getNutrients() > maxNutri){
      System.out.println("You are full! Eat later.");
    }
    else{
      items.remove(a);
      health += a.getNutrients();
      System.out.println("You ate a " + a.getName());
    }
  }

  public void eatPlant(Item plantFood){
    ItemNode currentItem = items._start;
    while(currentItem.getContents() != a.getName()){
      currentItem = currentItem.getNext();
    }
    if(health + a.getNutrients() > maxNutri){
      System.out.println("You are full! Eat later.");
    }
    else{
      currentItem.pop();
      health += a.getNutrients();
    }
  }

  //Attack method: Returns health after
  public double attack(){
    int target = checkVicinity();
    Animal prey = island.getAnimals().get(target);

    int chance = (int) (Math.random() * 2);
    if(chance == 0){
      System.out.println("Darn, you didn't catch it this time!");
    }
    else{
      System.out.println("Whew! You captured the " + prey);
      island.removeAnimal(target);
      items.add(prey);
    }
    health -= (prey.getLife() * prey.getPower());
    return health;
  }

  //checkVicinity determines which animal to hunt next; based on the closest animal
  public int checkVicinity(){
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


/*
  public void fish(){
    if(health > )
  }
  */

} // end of class
