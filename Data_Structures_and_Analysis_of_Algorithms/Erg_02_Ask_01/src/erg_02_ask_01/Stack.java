/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erg_02_ask_01;

/**
 *
 * @author alexander
 */
public interface Stack {
    public int size( );
    // Returns the size of the Stack
    
    
    public boolean isEmpty( );
    // Returns true if the Stack is empty
    
    
    public boolean isFull( );
    // Returns true if the Stack is full
    
    
    public Object top( ) throws StackEmptyException;
    // Returns the top item of the Stack
    
    
    public void push(Object item) throws StackFullException;
    // Adds a new item into the Stack
    
    
    public Object pop() throws StackEmptyException;
    // Removes the top item of the Stack
    
}
