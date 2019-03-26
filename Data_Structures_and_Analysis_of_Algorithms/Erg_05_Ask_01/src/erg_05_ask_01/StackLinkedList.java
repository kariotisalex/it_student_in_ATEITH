
package erg_05_ask_01;

public class StackLinkedList implements Stack{
    
    private SimpleLinkedList linkedListStackObject;

    public StackLinkedList() {
        linkedListStackObject = new SimpleLinkedList();
    }
    
     
    
    
    
    public int size( ){
        return linkedListStackObject.size();
    }
    public boolean isEmpty( ){
        return linkedListStackObject.isEmpty();
    }
    public boolean isFull( ){
        return false;
    }
    public Object top( ) throws StackEmptyException{
        if(linkedListStackObject.isEmpty()){
            throw new StackEmptyException("Stack is empty");
        }else{
            return linkedListStackObject.getFirstDataObject();
        }
    }
    public void push(Object item) throws StackFullException{
        linkedListStackObject.insertFirst(item);
        
        
    }
    public Object pop( ) throws StackEmptyException{
        return linkedListStackObject.removeFirst();
    }
    
    
    
    
}
