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
public class LongTest {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;
        
        lightspeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        
        distance = lightspeed * seconds;
        
        System.out.print("In "+days);
        System.out.print(" days light will travel about ");
        System.out.println(distance+" miles ");
    }
}
