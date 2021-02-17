/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamidlevel;

import java.util.Random;

/**
 *
 * @author DELL
 */
public class RandomDemo {
    public static void main(String[] args) {
        
        Random rand = new Random();
        
        int randomNumber = rand.nextInt(10) + 5;
        System.out.println("Random Number: "+randomNumber);
    }
}
