/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;

/**
 *
 * @author DELL
 */
public class IfSample {
    public static void main(String[] args) {
        int x,y;
        x = 10;
        y = 20;
        
        if(x < y)
            System.out.println("x is less than y");
        x = x *2;
        if(x == y)
            System.out.println("x now equal to y");
        x = x *2;
        if(x > y)
            System.out.println("x now greater than y");
        
        if(x == y)
            System.out.println("you won't see this");
    }
}
