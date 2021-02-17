/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

/**
 *
 * @author DELL
 */
public class ByteShift {
    public static void main(String[] args) {
        byte a = 64, b;
        int i;
        
        i = a << 2;
        b = (byte)(a << 2);
        
        System.out.println("Original value of a: "+a);
        System.out.println("i and b: "+i+" "+b);
    }
}
