
package erg_05_ask_01;

public interface Stack {
    
    public int size( );
    public boolean isEmpty( );
    public boolean isFull( );
    public Object top( ) throws StackEmptyException;
    public void push(Object item) throws StackFullException;
    public Object pop( ) throws StackEmptyException;

}
class StackEmptyException extends RuntimeException{

    public StackEmptyException(String err) {
        super(err);
    }
}

class StackFullException extends RuntimeException{

    public StackFullException(String err) {
        super(err);
    }
}