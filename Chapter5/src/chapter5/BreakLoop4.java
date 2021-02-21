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
//Using break to exit from nested loop
public class BreakLoop4 {
    public static void main(String[] args) {
        outer:
        for(int i=0; i<3; i++){
            System.out.print("Pass "+i+": ");
            for(int j=0; j<100; j++){
                if(j == 10)
                    break outer;        //exit both loop
                System.out.print(j+" ");
            }
            System.out.println("This will not print");
        }
        System.out.println("Loop Complete.");
    }
}
