/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import static java.util.concurrent.TimeUnit.SECONDS;

/**
 *
 * @author  Kavya Reddy Mylapurapu
 */
public class LinkedBlockingQueueClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        try{
        LinkedBlockingQueue<Integer> lbq=new LinkedBlockingQueue<>(5);
        lbq.add(5);
        System.out.println(lbq.remainingCapacity());
        lbq.add(6);
        System.out.println(lbq.remainingCapacity());
        lbq.add(7);
        System.out.println(lbq.remainingCapacity());
        lbq.add(8);
        System.out.println(lbq.remainingCapacity());
        lbq.add(6);
       System.out.println(lbq.remainingCapacity());
     System.out.println("adding 10:"+lbq.offer(10,5,SECONDS));
     System.out.println("Using offer method,when we try to add elements "
                + "more than it's capacity, it will wait for time limit that we mentioned "
                + "(here it is 5 seconds) and then returns false" );
   
        System.out.println("\n but if we try to add elements using put method more than it's "
                + " capacity, it will throw IllegalStateException because of exceeding capacity  ");
        
        Iterator<Integer> itr=lbq.iterator();
        Integer i=0;
        for(Integer s: lbq)
        {
            int elem=0;
            for(Integer s1:lbq)
            {
            if(s1.equals(s))
            {
                elem++;
                if(elem>1 && i!=s)
                {
                    i+=s;
                    System.out.println(s);
                }
            }
            }
        }

        System.out.println(lbq.poll());
            System.out.println("gets and removes the first element of this queue, "
                    + "or returns null if this queue is empty.");
        System.out.println(lbq.remove());
            System.out.println("If queue is empty remove() method will throw NoSuchElementException");
        lbq=new LinkedBlockingQueue();
        System.out.println(lbq.peek());
            System.out.println("Retrieves, but does not remove, the first element of this queue / returns null if this queue is empty.");
       System.out.println(lbq.element());
            System.out.println("returns the head of the Queue and  throws NoSuchElementException when the queue is empty ");
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        catch(NoSuchElementException e){
            System.out.println(e);
        }
     
               
    }
}
    

