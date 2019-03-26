
package erg_03_ask_01;

public class ArrayQueue implements Queue{
    
    private Object[] arrayQueue;
    private int first = 0;
    private int last = 0;

    public ArrayQueue() {
        arrayQueue = new Object[50];
    }

    public ArrayQueue(int size) {
        arrayQueue = new Object[size];
    }
    
    public int size(){
        return arrayQueue.length;
    }
    
    public boolean isEmpty(){
        return first == last;
    }
    
    public boolean isFull(){
        return ((first == 0) && (last == arrayQueue.length - 1)); 
    }
    
    public Object front() throws QueueEmptyException{
        try{
            if(this.isEmpty())
                throw new QueueEmptyException("Array is Empty");
            
            return arrayQueue[first];
            
        }catch(QueueEmptyException e){
            System.out.println("\n" + e + "\nAdd elements in Queue");
            return null;
        }  
    }
    
    public void add(Object item) throws QueueFullException{
        try{
            if(this.isFull())
                throw new QueueFullException("Array is Full");
            
            else if((last == arrayQueue.length) && (first != 0)){
                int temp = 0;
                for(int i = 0; i <= (last - first);i++){
                    arrayQueue[i] = arrayQueue[first + i];
                    temp = i;
                }
                last = temp + 1;
                first = 0;
                arrayQueue[last] = item;
                last++;
            }else{
                arrayQueue[last] = item;
                last++;
            }
            
        }catch(QueueFullException e){
            System.out.println(e + "\nPlease remove items from queue");
        }
    }
    
    public Object remove() throws QueueEmptyException{
        try{
            if(this.isEmpty())
                throw new QueueEmptyException("The queue is empty");
            else{
                Object temp;
                temp = arrayQueue[first];
                arrayQueue[first] = null;
                first++;
                return temp;
            }
        }catch(QueueEmptyException e){
            System.out.println("\n" + e + "\nPlease insert items in queue");
            return null;
        }
    }
/*
    
    M E T H O D S   F O R   T E S T I N G
    public void arraysSpace(){
        for(int i = 0; i < arrayQueue.length; i++){
            if(arrayQueue[i] == null)
                System.out.println("null " + i);
        }
    }
    public int getFirst() {
        return first;
    }

    public int getLast() {
        return last;
    }
   E N D  M E T H O D S   F O R   T E S T I N G
*/
}
