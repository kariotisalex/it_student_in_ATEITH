
package erg_04_ask_01;


public class SLListNode {
    // Instance fields
    private Object data;
    private SLListNode nextNode;

    public SLListNode(Object data, SLListNode node) {
        this.nextNode = node;
        this.data = data;
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
        return (String)data;
    }
    
    
}
