/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

//Demonstrate return
public class Return {
    public static void main(String[] args) {
        boolean t = true;
        
        System.out.println("Before the return.");
        
        if(t)
            return;
        System.out.println("This won't execute");
    }
}
