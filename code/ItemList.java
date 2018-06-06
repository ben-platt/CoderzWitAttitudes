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
	if ( _size == 0 ) {
	    _start = new ItemNode( thing );
	    _size = 1;
	    return;
	}
	ItemNode currentItem = _start;
	while( currentItem != null ) {
	    if ( currentItem.getContents() == thing.name ) {
		currentItem.getItem().push( thing );
		currentItem.incrementQuantity();
		return;
	    }
	    currentItem = currentItem.getNext();
	}
	currentItem = _start;
	while( currentItem != null ) {
	    if ( currentItem.getType() == thing.type ) {
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
	ItemNode newPrev = currentItem.getPrev();
	currentItem = new ItemNode( thing );
	currentItem.setPrev( newPrev );
	_size++;
    }

    public void remove( Item thing ) {
	ItemNode currentItem = _start;
	while( currentItem != null ) {
	    if ( currentItem.getContents() == thing.name ) {
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
	}
	String currentType = _start.getType();
	System.out.println( " " + currentType );
	while( currentItem != null ) {
	    if ( currentItem.getType() != currentType ) {
	        currentType = currentItem.getType();
		System.out.println( " " + currentType );
	    }
	    System.out.println( "  " + currentItem.getContents() + " (" + currentItem.getQuantity() + ") " );
	    currentItem = currentItem.getNext();
	}
    }

    public static void main( String[] args ) {

	ItemList items = new ItemList();
	
	Coconut coco1 = new Coconut();
	Coconut coco2 = new Coconut();
	Bark bark1 = new Bark();
	Bark bark2 = new Bark();
	Bark bark3 = new Bark();
	Catfish catfish1 = new Catfish();
	
	items.add( coco1 );

	items.display();
	
	items.add( bark1 );

	items.display();
	
	items.add( bark2 );

	items.display();
	
	items.add( catfish1 );

	items.display();

	items.add( bark3 );

	items.display();
	
	items.add( coco2 );

	items.display();

	items.remove( bark3 );
	
	items.display();
    }

}//end ItemQueue   
