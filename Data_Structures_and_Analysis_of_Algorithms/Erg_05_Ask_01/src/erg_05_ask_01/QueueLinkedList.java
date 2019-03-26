
package erg_05_ask_01;

public class QueueLinkedList implements Queue{
    
    
    private SimpleLinkedList linkedListQueueObject;

    public QueueLinkedList() {
        linkedListQueueObject = new SimpleLinkedList();
    }
    
    
    public int size( ){
        return linkedListQueueObject.size();
    }
    
    public boolean isEmpty(){
        return linkedListQueueObject.isEmpty();
    }
    
    public boolean isFull(){
        return false;
    }
    
    public Object front() throws QueueEmptyException{
        if(linkedListQueueObject.isEmpty())
            throw new QueueEmptyException("Queue is empty");
        else{
            return linkedListQueueObject.getFirstDataObject();
        }
    }
    public void add(Object item) throws QueueFullException{
        linkedListQueueObject.insertLast(item);
    }
    
    public Object remove( ) throws QueueEmptyException{
        return linkedListQueueObject.removeFirst();
    }
    
    
    
    
    
}
