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
    private Stack<Object> _item;
    private ItemNode _prevItem;
    private ItemNode _nextItem;
    private int _quantity;

    // CONSTRUCTOR(S)
    public ItemNode( Object value ) {
	_item = new Stack<Object>();
	_item.push( value );
	_prevItem = null;
	_nextItem = null;
	_quantity = 1;
	//_contents = value.name;
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
    }/*
    public String getType() {
	return _item.peek().type;
    }
    public String getPrevType() {
	return _prevItem.getType();
    }
    public String getNextType() {
	return _nextItem.getType();
	}*/
    public Object getItem() {
	return _item.peek();
    }
    public Object getPrev() {
	return _prevItem.getItem();
    }
    public Object getNext() {
	return _nextItem.getItem();
    }

    // * Mutators *
    public void setItem( Object newValue ) {
	_item = new Stack<Object>();
	_item.push( newValue );
    }
    public void setNext( ItemNode newNext ) {
	_nextItem = newNext;
    }
    public void setPrev( ItemNode newPrev ) {
	_prevItem = newPrev;
    }
    
    // override inherited toString
    public String toString() {
	return _item.toString();
    }
    

}//end ItemNode
