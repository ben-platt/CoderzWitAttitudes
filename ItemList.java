// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-08f

/*****************************************************
 * class ItemList
 ******************************************************/

import java.util.Stack;

public class ItemList {

    // INSTANCE VARIABLES
    public ItemNode _start, _end;
    public int _size;

    // CONSTRUCTOR(S)
    public ItemList() {
	_start = null;
	_size = 0;
    }

    // METHODS

    /* Items are sorted as such :
       1. Stacks of Tools
       2. Stacks of Collected Plants
       3. Stacks of Edible Plants
       4. Stacks of Animals
    */

    public void add( Item thing ) {
	// No items
	if ( _size == 0 ) {
	    _start = new ItemNode( thing );
	    _size = 1;
	    return;
	}
	// Checks if there is already a collection of given Item and inserts
	ItemNode currentItem = _start;
	while( currentItem != null ) {
	    if ( currentItem.getContents() == thing.getName() ) {
		currentItem.getItem().push( thing );
		currentItem.incrementQuantity();
		return;
	    }
	    currentItem = currentItem.getNext();
	}
	// Checks if there is already items of given type stored and inserts
	currentItem = _start;
	while( currentItem.getNext() != null ) {
	    if ( currentItem.getItemType() == thing.getType() ) {
	        ItemNode newNext = currentItem.getNext();
		ItemNode newItem = new ItemNode( thing );
		currentItem.setNext( newItem );
		newItem.setPrev( currentItem );
		newItem.setNext( newNext );
		newNext.setPrev( newItem );
		_size++;
		return;
	    }
	    currentItem = currentItem.getNext();
	}
	// to avoid NullPointerException
	if ( currentItem.getItemType() == thing.getType() ) {
	        ItemNode newNext = currentItem.getNext();
		ItemNode newItem = new ItemNode( thing );
		currentItem.setNext( newItem );
		newItem.setPrev( currentItem );
		newItem.setNext( newNext );
		_size++;
		return;
	    }
	// Puts in a new ItemNode at the end of the Double Linked List
	ItemNode newNode = new ItemNode( thing );
	newNode.setPrev( currentItem );
	currentItem.setNext( newNode );
	_size++;
    }

    public void remove( Item thing ) {

	ItemNode currentItem = _start;
	while( currentItem != null ) {
	    if ( currentItem.getContents() == thing.getName() ) {
		currentItem.getItem().pop();
		currentItem.decrementQuantity();
		return;
	    }
	    currentItem = currentItem.getNext();
	}
    }

    public void display() {

	System.out.println( "ITEMS: " );
	ItemNode currentItem = _start;
	if ( _size == 0 ) {
	    System.out.println( " empty " );
	    return;
	}
	String currentType = _start.getItemType();
	System.out.println( "  " + currentType );
	while( currentItem != null ) {
	    if ( currentItem.getItemType() != currentType ) {
	        currentType = currentItem.getItemType();
		System.out.println( "  " + currentType );
	    }
	    System.out.println( "      " + currentItem.getContents() + " (" + currentItem.getQuantity() + ") " );
	    currentItem = currentItem.getNext();
	}
    }


    /* MAIN METHOD
    public static void main( String[] args ) {

	ItemList items = new ItemList();

	Coconut coco1 = new Coconut();
	Coconut coco2 = new Coconut();
	Bark bark1 = new Bark();
	Bark bark2 = new Bark();
	Bark bark3 = new Bark();
	Catfish catfish1 = new Catfish();

	items.display();
	items.pickUp( coco1 );
	items.display();
       	items.pickUp( bark1 );
	items.display();
	items.pickUp( bark2 );
	items.display();
	items.pickUp( catfish1 );
	items.display();
	items.pickUp( bark3 );
	items.display();
	items.pickUp( coco2 );
	items.display();
	items.drop( bark3 );
	items.display();
    }
    */ // END OF MAIN METHOD

}//end ItemQueue
