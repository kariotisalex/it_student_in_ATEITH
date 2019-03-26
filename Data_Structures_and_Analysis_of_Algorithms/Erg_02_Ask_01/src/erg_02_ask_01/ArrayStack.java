
package erg_02_ask_01;


public class ArrayStack implements Stack{
    private Object[] aListOfObjects;
    private int counter;

    public ArrayStack(int sizeOfStack) {
        aListOfObjects = new Object[sizeOfStack];
    }

    public ArrayStack() {
        aListOfObjects = new Object[50];
    }
    
    @Override
    public int size(){
        return aListOfObjects.length;
    }
    
    public boolean isEmpty(){
        return (aListOfObjects[0] == null);
        
    }
    @Override
    public boolean isFull(){
        return (aListOfObjects.length - 1 == counter);
    }
    
    
    public Object top() throws StackEmptyException{
        if(this.isFull())
            return aListOfObjects[aListOfObjects.length - 1];
        else if(this.isEmpty())
            throw new StackEmptyException("Empty");
        else
            return aListOfObjects[counter];
           
        }
    
    public void push(Object item) throws StackFullException{
        if(this.isFull())
            throw new StackFullException("Stack is Full");
        else{
            aListOfObjects[counter] = item;
            counter++;
        }
    }
    
    @Override
    public Object pop() throws StackEmptyException{
        Object tempObj = aListOfObjects[counter];
        aListOfObjects[counter] = null;
        counter--;
        return tempObj;
        
    }

    
    
    
}
