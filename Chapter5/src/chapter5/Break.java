/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

/**
 *
 * @author DELL
 */
//Using break as a civilized form of goto
public class Break {
    public static void main(String[] args) {
        boolean t = true;
        
        first:{
            second:{
                third:{
                    System.out.println("Before the break");
                    if(t)
                        break second;
                    System.out.println("This won't execute");
                }
                System.out.println("This won't execute");
            }
            System.out.println("This is after second break");
        }
    }
}
