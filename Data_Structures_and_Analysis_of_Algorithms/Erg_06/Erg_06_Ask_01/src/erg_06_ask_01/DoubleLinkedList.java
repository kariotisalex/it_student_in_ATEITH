
package erg_06_ask_01;


public class DoubleLinkedList implements List{
    private DoubleNode first;
    

    public DoubleLinkedList() {
        first = null;
    }
    
    // Is Empty ?
    @Override
    public boolean isEmpty( ){
        return first == null;
    }
    
    
    // Size
    @Override
    public int size( ){
        int counter = 0;
        DoubleNode aTempVar = first;
        if(this.isEmpty()){
            System.out.println("The linked list is empty");
            return counter;
        }else{
            while( aTempVar.getNext() != null ){
                aTempVar = aTempVar.getNext();
                counter++;
            }//while
        }//else
        return counter;
            
    }
    
    
    // Insert First
    @Override
    public void insertFirst(Object data){
        
        if(this.isEmpty()){
            first.setItem(data);
        }else{
            DoubleNode tempObj = new DoubleNode(data,first ,null);
            first.setPrevious(tempObj);
            first = tempObj;
        }
    }
    
    
    
    // Insert Last
    @Override
    public void insertLast(Object data){
        DoubleNode aTempVar = first;
        
        
        if(this.isEmpty())
            first = new DoubleNode(data,null ,null);
        else{
            while(aTempVar.getNext() != null){
                aTempVar = aTempVar.getNext();
            }
        aTempVar.setNext(new DoubleNode(data,null ,aTempVar));
        
        }
    }
    
    
    
    // Insert
    @Override
    public void insert(int position, Object data) throws NoSuchListPosition{
        
        if(this.isEmpty() || (this.size() < position)){
            throw new NoSuchListPosition("there is no object in this position");
        
        
        }else if(position == 0){
            DoubleNode aTempVar = first;
            first = new DoubleNode(data,aTempVar,null);
            aTempVar.setPrevious(first);
            
        
        }else if(position == size()){
            
            DoubleNode aTempVar = first;
            
            while( aTempVar.getNext() != null ){
                aTempVar = aTempVar.getNext();
            }//while
            DoubleNode newObject = new DoubleNode(data, null, aTempVar);
            aTempVar.setNext(newObject);
            
            
        }else {
            int counter = 0;
            DoubleNode aTempVar = first;
           
                while( counter != position ){
                    aTempVar = aTempVar.getNext();
                    counter++;                    
                }//while
                    
            DoubleNode newObject = new DoubleNode(data, aTempVar, aTempVar.getPrevious());
            aTempVar.getPrevious().setNext(newObject);            
            aTempVar.setPrevious(newObject);
        }//else
    }//method
    
    // Remove First
    @Override
    public Object removeFirst( ) throws ListEmptyException{
        if(this.isEmpty()){
            throw new ListEmptyException("Empty List");
        }else{
            DoubleNode aTempVar = first;
            first = first.getNext();
            first.setPrevious(null);
            return aTempVar;
        }// else
    }
    
    // Remove Last
    @Override
    public Object removeLast( ) throws ListEmptyException{
        int counter = 0;
            DoubleNode aTempVar = first;
                while( counter != size() ){
                    aTempVar = aTempVar.getNext();
                    counter++;                    
                }//while
                aTempVar.getPrevious().setNext(null);
                return aTempVar;
    }// method
    
    // Remove
    @Override
    public Object remove(int position) throws ListEmptyException, NoSuchListPosition{
        if(this.isEmpty()){
            throw new ListEmptyException("Empty list");
        
        }else if(size() < position){
            throw new NoSuchListPosition("Position is out of Link List");
        
        }else {
            int counter = 0;
            DoubleNode aTempVar = first;
           
                while( counter != position ){
                    aTempVar = aTempVar.getNext();
                    counter++;                    
                }//while
                
                aTempVar.getPrevious().setNext(aTempVar.getNext());
                aTempVar.getNext().setPrevious(aTempVar.getPrevious());
                return aTempVar;
        }// else
    }// method
    
}// class
