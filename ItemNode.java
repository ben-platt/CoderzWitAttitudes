// CoderzWitAttitudes ( Fiona Cai, Kayli Matsuyoshi, Ben Platt )
// APCS2 pd1
// Final Project -- Island Survival Game
// 2018-06-08f

/*****************************************************
 * class ItemNode
 ******************************************************/

import java.util.Stack;

public class ItemNode {

    // INSTANCE VARIABLES
    private String _contents; 
    private Stack<Item> _item;
    private ItemNode _prevItem;
    private ItemNode _nextItem;
    private int _quantity;

    // CONSTRUCTOR(S)
    public ItemNode( Item value ) {
	_item = new Stack<Item>();
	_item.push( value );
	_prevItem = null;
	_nextItem = null;
	_quantity = 1;
	_contents = value.getName();
    }

    // METHODS

    // * Accessors *
    public String getContents() {
	return _contents;
    }
    public String getPrevContents() {
	return _prevItem.getContents();
    }
    public String getNextContents() {
	return _nextItem.getContents();
    }
    public String getItemType() {
	return _item.peek().getType();
    }
    public String getPrevItemType() {
	return _prevItem.getItemType();
    }
    public String getNextItemType() {
	return _nextItem.getItemType();
    }
    public Stack<Item> getItem() {
	return _item;
    }
    public ItemNode getPrev() {
	return _prevItem;
    }
    public ItemNode getNext() {
	return _nextItem;
    }
    public int getQuantity() {
	return _quantity;
    }

    // * Mutators *
    public void setItem( Item newValue ) {
	_item = new Stack<Item>();
	_item.push( newValue );
    }
    public void setNext( ItemNode newNext ) {
	_nextItem = newNext;
    }
    public void setPrev( ItemNode newPrev ) {
	_prevItem = newPrev;
    }
    public void incrementQuantity() {
	_quantity++;
    }
    public void decrementQuantity() {
	_quantity--;
    }
    
    // override inherited toString
    public String toString() {
	return _item.toString();
    }
    

}//end ItemNode
