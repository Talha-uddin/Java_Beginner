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
public class BreakLoop {
    public static void main(String[] args) {
        for(int i=0; i<100; i++){
            if(i == 10)
                break;
            System.out.println("i = "+i);
        }
        System.out.println("Loop Complete.");
    }
}
