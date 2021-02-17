/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamidlevel;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class NumberConversionDemo {

    public static void main(String[] args) {
        int decimal;
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter the binary number: ");
        decimal = input.nextInt();
        
        //to Binary
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary = " + binary);

        //to Octal
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal = " + octal);
    }
}
