/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksanddeques;

import java.util.ArrayDeque;

/**
 *
 * @author  Kavya Reddy Mylapurapu
 */
public class AStack<E>{
   

    private ArrayDeque<E> myStack;

    /**
     * This is a no argument constructor which initializes ArrayDeque
     */
    public AStack() {
        myStack = new ArrayDeque<>();
    }

    /**
     * This method add elements to ArrayDeque
     * @param element element that needs to be added to ArrayDeque
     */
    public void push(E element) {
        myStack.push(element);
    }

    /**
     * This method removes the element from ArrayDeque
     * @return the element that is added
     */
    public E pop() {
        return myStack.pollFirst();
    }

    /**
     * This method retrieves first element from ArrayDeque
     * @return the first element in ArrayDeque
     */
    public E peek() {
        return myStack.peekFirst();
    }

    /**
     * This method returns the ArrayDeque size
     * @return size of ArrayDeque
     */
    public int size() {
        return myStack.size();
    }

    /**
     * This method returns if the ArrayDeque is empty
     * @return a Boolean value if ArrayDeque is empty
     */
    public boolean isEmpty() {
        return myStack.isEmpty();
    }
    

    
    
}
