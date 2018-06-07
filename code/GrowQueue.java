/*****************************************************
 * class GrowQueue
 ******************************************************/
import java.util.ArrayList;

public class GrowQueue {

   // ~~ INSTANCE VARIABLES ~~
    
    private ArrayList<Item> _queue;

    // ~~~~ CONSTRUCTOR(S) ~~~~

    public GrowQueue()
    {
        _queue = new ArrayList<Item>();
    }
    
    // ~~~~~~~ METHODS ~~~~~~~~

    public Item remove() {
	Item removed = _queue.get( _queue.size() - 1 );
        _queue.remove( _queue.size() - 1 );
	return removed;
    }

    public void grow( Item x ) {
	ArrayList temp = new ArrayList();
	temp.add( x );
	for( int i = 0; i < _queue.size(); i++ ) {
	    temp.add( _queue.get(i) );
	}
	_queue = temp;
    }

    // Returns true if this queue is empty, otherwise returns false.
    public boolean isEmpty() {
	return _queue.isEmpty();
    }

    // Returns the first element of the queue without dequeuing it.
    public Item peekFront() {
	return _queue.get( _queue.size() - 1 );
    }

} // end class GrowQueue 
