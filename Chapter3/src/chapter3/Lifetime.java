/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3;

/**
 *
 * @author DELL
 */
public class Lifetime {
    public static void main(String[] args) {
        int x;
        
        for(x=0; x<3; x++)
        {
            int y=-1;
            System.out.println("y is "+y);
            y = 100;
            System.out.println("y is now "+y);
                    
        }
    }
}
