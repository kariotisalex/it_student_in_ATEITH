package erg_03_ask_01;


public interface Queue {
        public int size();
    // Returns the size of the queue
        public boolean isEmpty();
    // Returns true if the queue is empty
        public boolean isFull();
    // Returns true if the queue is full
        public Object front() throws QueueEmptyException;
    // Returns the first element of the queue
        public void add(Object item) throws QueueFullException;
    // Adds an element at the end of the queue
        public Object remove() throws QueueEmptyException;
    // Removes the first element of the queue
}
class QueueEmptyException extends RuntimeException{
    public QueueEmptyException(String err){
        super(err);
    }
}

class QueueFullException extends RuntimeException{
    public QueueFullException(String err){
        super(err);
    }
}