
package erg_06_ask_02;


public class DoubleNode extends SLListNode{
    private DoubleNode previous;
    
    
    public DoubleNode( ) {
        this(null,null,null); 
    }
    public DoubleNode(Object data, DoubleNode next, DoubleNode previous) {
        super(data,next);
        this.previous = previous; 
    }
    
    
    public Object getItem( ) {
        return(super.getNodeData()); 
    }
    public DoubleNode getNext( ) {
        return(DoubleNode) (super.getNextNode()); 
    }
    public DoubleNode getPrevious( ) {
        return(previous); 
    }
    public void setItem(Object newItem) {
        super.setNodeData(newItem);
        
    }
    public void setNext(DoubleNode newNext) {
        super.setNextNode(newNext); 
    }
    public void setPrevious(DoubleNode newPrevious) {
        previous = newPrevious; 
    }
    
    
}
