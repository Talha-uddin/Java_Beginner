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
public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.14;
        
        System.out.println("\nConversion of int to byte.");
        b = (byte)i;
        System.out.println("i and b "+i+" "+b);
        
        System.out.println("\nConversion of double to int.");
        i = (int)d;
        System.out.println("d and i "+d+" "+i);
        
        System.out.println("\nConversion of double to byte.");
        b = (byte)d;
        System.out.println("d and b "+d+" "+b);
    }
}
