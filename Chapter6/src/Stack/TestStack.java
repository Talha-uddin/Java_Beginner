/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author DELL
 */
public class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();
        
        //for push
        for(int i=0; i<10; i++)
            mystack1.push(i);
        for(int i=10; i<20; i++)
            mystack2.push(i);
        
        //for pop
        System.out.println("Stack in mystack1");
        for(int i=0; i<10; i++){
            System.out.println(mystack1.pop());
        }
        
        System.out.println("Stack in mystack2");
        for(int i=0; i<10; i++){
            System.out.println(mystack2.pop());}
            
    }
}
