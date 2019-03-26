/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erg_05_ask_01;

/**
 *
 * @author alexander
 */
public interface Queue {
    
    public int size( );
    public boolean isEmpty( );
    public boolean isFull();
    public Object front( ) throws QueueEmptyException;
    public void add(Object item) throws QueueFullException;
    public Object remove( ) throws QueueEmptyException;
}

class QueueEmptyException extends RuntimeException{
    public QueueEmptyException(String err) {
        super(err);
    }
}

class QueueFullException extends RuntimeException{
    public QueueFullException(String err) {
        super(err);
    }
}