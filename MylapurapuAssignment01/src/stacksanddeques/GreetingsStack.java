/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksanddeques;

/**
 *
 * @author  Kavya Reddy Mylapurapu
 */
public class GreetingsStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AStack<Character> greeting = new AStack<>();
        String s="Happy New Year";
         for (char c : s.toCharArray()) {
       greeting.push(c);
         
        System.out.print(greeting.peek());
         }
        
    }
    
}
