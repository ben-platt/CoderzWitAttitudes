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
  private boolean hasFishNet;

  private Island island;

  // CONSTRUCTOR(S)
  //Default constructor
  public Player() {
    age = 17;
    height = 65.0;
    weight = 108.0;
    health = 82;
    maxNutri = 100;
    island = new Island();
    xcor = 0;
    ycor = 0;
    items = new ItemList();
    hasShelter = false;
    hasFishNet = false;
  }

  public Player(int a, double h, double w, double heal){
    age = a;
    height = h;
    weight = w;
    if(((weight/2.2) / (Math.pow((height/2.54), 2))) * age > 82){
      health = 82;
    }
    else{
      health = ((weight/2.2) / (Math.pow((height/2.54), 2))) * age; //this is BMI * age;
    }
    maxNutri = 100;
    island = new Island();
    xcor = 0;
    ycor = 0;
    items = new ItemList();
    hasShelter = false;
    hasFishNet = false;
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

  public Island getIsland(){
    return island;
  }
    public boolean hasShelter() {
	return hasShelter;
    }

    public boolean hasFishNet(){
      return hasFishNet;
    }

    public ItemList getItems(){
      return items;
    }

  public String getPlantFood(){
    ItemNode currentItem = items._start;
    String listplants = "";
    int num = 1;
    while( currentItem != null){
      if( currentItem.getItemType() == "plantFood"){
        listplants += num + currentItem.getContents() + "\n"; //traverse through items, if it is plantFood, add to string
      }
      currentItem = currentItem.getNext();
      num++;
    }
    if(listplants.equals("")){
      return "Sorry you have no plants to eat";
    }
    else{
      return listplants;
    }
  }

  public String getAnimalFood(){
    ItemNode currentItem = items._start;
    String listanimals = "";
    int num = 1;
    while( currentItem != null){
      if( currentItem.getItemType() == "animalFood"){
        listanimals += num + currentItem.getContents() + "\n"; //traverse through items, if it is animalFood add to string
      }
      currentItem = currentItem.getNext();
      num++;
    }
    if(listanimals.equals("")){ //if nothing was added, there are no animals
      return "Sorry you have no animals to eat";
    }
    else{
      return listanimals;
    }
  }

  // Mutator Methods
  public void setAge( int inputAge ){
    age = inputAge;
  }
  public void setHeight( int inputHeight ){
    height = (double) inputHeight;
  }
  public void setWeight( int inputWeight ){
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

  public void sleep(){
    if(hasShelter){
      if(health + 35 > maxNutri){
        health += maxNutri - health; //add health up to the max health
        System.out.println("You are at maxHealth");
      }
      else{
        health += 35; //add 35 health if player takes a schleep
        System.out.println("nice sleep");
      }
    }
    else{
      System.out.println("You need to build a shelter before you can sleep!");
    }
  }
  public void buildShelter(){
      if ( items._size == 0 ) { //null exception
	  System.out.println("Sorry. You need 4 more Bark and 3 more Palm Leaves to build a shelter." );
	  return;
      }
    ItemNode currentItemB = items._start;
    while(!currentItemB.getContents().equals("Bark") && !currentItemB.getNext().equals(null)){
      currentItemB = currentItemB.getNext(); //traverse up to Bark stack
    }

    ItemNode currentItemP = items._start;
    while(!currentItemP.getContents().equals("PalmLeaf") && !currentItemP.getNext().equals(null)){
      currentItemP = currentItemP.getNext(); //traverse up to Palm leaves stack
    }

    int numBark = 0;
    int numPalmLeaves = 0;
    if ( currentItemB.getContents().equals("Bark") ) {
	numBark = currentItemB.getQuantity(); //get number of bark in stack
    }
    if ( currentItemP.getContents().equals("PalmLeaf") ) {
	numPalmLeaves = currentItemP.getQuantity(); //get number of palm leaves in stack
    }

    if(numBark >= 4 && numPalmLeaves >= 3){ //if number of bark is at least 4 and number of palm leaves is at least 3
	     hasShelter = true; //you can build a shelter, boolean set to true
	for(int i = 0; i < 4; i++){
	    currentItemB.getItem().pop(); //take out 4 bark
	}
	for(int i = 0; i < 3; i++){
	   currentItemP.getItem().pop(); //take out 3 palm leaves
	}
      System.out.println("You have successfully built a shelter. You can now sleep!");
    }

    else{
      System.out.println("Sorry. You need "+ (4-numBark) + " more Bark and " + (3-numPalmLeaves) + " more Palm Leaves to build a shelter" ); //print out materials you lack to build shelter
    }
  }

  public void buildFishNet(){
      if ( items._size == 0 ) {
	  System.out.println("Sorry. You need 2 more Palm Leaves to make a fishnet." );
	  return;
      }
    ItemNode currentItemPa = items._start;
    while(!currentItemPa.getContents().equals("PalmLeaf") && !currentItemPa.getNext().equals(null) ){
      currentItemPa = currentItemPa.getNext();
    }
    int numberPalmLeaves = 0;
    if ( currentItemPa.getContents().equals("PalmLeaf") ) {
	numberPalmLeaves = currentItemPa.getQuantity();
    }

    if(numberPalmLeaves >= 2){
      hasFishNet = true;
      for(int i = 0; i < 2; i++){
	  Item blah = currentItemPa.getItem().pop();
      }
      System.out.println("You have successfully made a fishnet. You can now fish!");
    }
    else{
      System.out.println("Sorry. You need " + (2-numberPalmLeaves) + " more Palm Leaves to build a fishnet" );
    }
  }

  // Eating methods
  public void eatAnimal(Item a){
    ItemNode currentItem = items._start;
    while(!currentItem.getContents().equals(a.getName())){
      currentItem = currentItem.getNext();
    }
    if(health + a.getNutrients() > maxNutri){
      System.out.println("You are full! Eat later.");
    }
    else{
      if(a instanceof Fugu){ //Fugu is special case
        if(((Fugu) a).chanceofSurvival()){ //5% of survival from eating Fugu
          items.remove(a);
          health += a.getNutrients();
        }
        else{
          System.out.println("You died from consuming the poisonous fugu"); //otherwise die from eating Fugu
          health = 0;
        }
      }
      else{
        items.remove(a);
        health += a.getNutrients();
        System.out.println("You ate a " + a.getName());
      }
    }
  }

  public void eatPlant(Item plantFood){
    ItemNode currentItem = items._start;
    while(!currentItem.getContents().equals(plantFood.getName())){
      currentItem = currentItem.getNext();
    }
    if(health + plantFood.getNutrients() > maxNutri){
      System.out.println("You are full! Eat later.");
    }
    else{
	items.remove(plantFood);
      health += plantFood.getNutrients();
    }
  }

  //Attack method
  public void attack(){
    if(health < 5){ //if you have insufficient health, you print message saying you need more health before attacking
      System.out.println("You need more health before you hunt!");
    }
    else{
      int target = checkVicinity();
      if(target == -1){
        System.out.println("Sorry there's no more animals on the island");
      }
      else{
        Animal prey = island.getAnimals().get(target);

        int chance = (int) (Math.random() * 2);
        if(chance == 0){

          health = health - (100* prey.getPower());
          if(health < 0){
            health = 0;
            System.out.println("YOU DIE, not enough health to capture " + prey.getName());
          }
          else{
              System.out.println("Darn, you didn't catch the " + prey.getName()+ " this time!");

          }

        }
        else{
          island.removeAnimal(target);
          items.add(prey);
          health = health - (100* prey.getPower());
          if(health < 0){
            health = 0;
            System.out.println("YOU DIE, not enough health to capture " + prey.getName());
          }
          else{
            System.out.println("Yay! You captured the " + prey.getName());

          }

        }
      }
    }

  }

  //checkVicinity determines which animal to hunt next; based on the closest animal
  public int checkVicinity(){
    ArrayList<Animal> tmp = island.getAnimals();
    if(tmp.size() == 0){
      return -1;
    }
    else{
      Animal tar;
      double min = distance(xcor, ycor, tmp.get(0).getXcor(), tmp.get(0).getYcor());
      int index = -1;
      int minindex = 0;
      for(int i = 0; i < tmp.size(); i++){
        Animal a = tmp.get(i);
        double current = distance(xcor, ycor, a.getXcor(), a.getYcor());
        if (current < min){
          tar = a;
          min = current;
          minindex = i;
        }
      }
      return minindex;
      }
    }

  private double distance(int x1, int y1, int x2, int y2){
    return (Math.sqrt(((x1-x2)*(x1-x2)) + ((y1-y2)*(y1-y2))));
  }


  public void fish(){
    if(health < 10){
      System.out.println("You need more health before you fish!");
      System.out.println("Your current health: "+health);
    }
    else{
      LinkedList<ArrayList<Fish>> pond = island.getFish();
      if (health > 10 && health < 40 ) {
        ArrayList<Fish> dep1 = pond.get(0);
        int chance = (int) (Math.random() * 2);
        double takenhealth = 0;
        String fishesgot = "";
        if(chance == 0){
          for(int i = 0; i < dep1.size(); i++){
            items.add(dep1.get(i));
            takenhealth += 20*dep1.get(i).getPower();
            fishesgot += dep1.get(i).getName() + ", ";
          }
          health = health - takenhealth;
          if(health < 0){
            health = 0;
            System.out.println("YOU DIE, not enough health to capture " + fishesgot);
          }
          else{
            System.out.println("Yay! You captured these fish at depth: " + fishesgot );
            System.out.println("Your current health: "+ health);
          }
        }
        else{
          for(int i = 0; i < dep1.size(); i++){
            takenhealth += 20*dep1.get(i).getPower();
            fishesgot += dep1.get(i).getName() + ", ";
          }
          health = health - takenhealth;
          if(health < 0){
            health = 0;
            System.out.println("YOU DIE, You didn't capture any of the fish");
          }
          else{
            System.out.println("You didn't capture any of the fish " );
            System.out.println("Your current health: "+ health);
          }
        }
      }
      else if(health > 40 && health < 70){
        ArrayList<Fish> dep2 = pond.get(1);
        int chance = (int) (Math.random() * 2);
        double takenhealth = 0;
        String fishesgot = "";
        if(chance == 0){
          for(int i = 0; i < dep2.size(); i++){
            items.add(dep2.get(i));
            takenhealth += 20*dep2.get(i).getPower();
            fishesgot += dep2.get(i).getName() + ", ";
          }
          health = health - takenhealth;
          if(health < 0){
            health = 0;
            System.out.println("YOU DIE");
          }
          else{
            System.out.println("Yay! You captured these fish: " + fishesgot );
            System.out.println("Your current health: "+ health);
          }
        }
        else{
          for(int i = 0; i < dep2.size(); i++){
            takenhealth += 20*dep2.get(i).getPower();
            fishesgot += dep2.get(i).getName() + ", ";
          }
          health = health - takenhealth;
          if(health < 0){
            health = 0;
            System.out.println("YOU DIE, You didn't capture any of the fish");
          }
          else{
            System.out.println("You didn't capture any of the fish " );
            System.out.println("Your current health: "+ health);
          }
        }
      }
      else if(health > 70 && health <= 100){
        ArrayList<Fish> dep3 = pond.get(2);
        int chance = (int) (Math.random() * 2);
        double takenhealth = 0;
        String fishesgot = "";
        if(chance == 0){
          for(int i = 0; i < dep3.size(); i++){
            items.add(dep3.get(i));
            takenhealth += 20*dep3.get(i).getPower();
            fishesgot += dep3.get(i).getName() + ", ";
          }
          health = health - takenhealth;
          if(health < 0){
            health = 0;
            System.out.println("YOU DIE");
          }
          else{
            System.out.println("Yay! You captured these fish: " + fishesgot );
            System.out.println("Your current health: "+ health);
          }
        }
        else{
          for(int i = 0; i < dep3.size(); i++){
            takenhealth += 20*dep3.get(i).getPower();
            fishesgot += dep3.get(i).getName() + ", ";
          }
          health = health - takenhealth;
          if(health < 0){
            health = 0;
            System.out.println("YOU DIE, You didn't capture any of the fish");
          }
          else{
            System.out.println("You didn't capture any of the fish " );
            System.out.println("Your current health: "+ health);
          }
        }
      }
    }
  }


} // end of class
