
package erg_05_ask_01;


public class SLListNode {
    // Instance fields
    private Object data = null;
    private SLListNode nextNode;

    public SLListNode(Object data) {
        this.data = data;
        nextNode = null;
    }
    
    
     
    // Instance methods
    public Object getNodeData( ){
        return data;
    }
    public SLListNode getNextNode(){
        return nextNode;
    }
    public void setNodeData(Object d){
        this.data = d;
    }
    public void setNextNode(SLListNode n){
        this.nextNode = n;
    }
    public String toString(){
        return data.toString();
    }
    
    
}
