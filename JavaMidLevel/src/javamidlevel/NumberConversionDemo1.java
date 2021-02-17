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
public class NumberConversionDemo1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        /*String binary = "1010";
        Integer decimal = Integer.parseInt(binary, 2);
      
        System.out.println("Decimal = "+decimal);*/
        
        /*String octal = "675";
        
        Integer decimal = Integer.parseInt(octal, 8);
        System.out.println("Decimal = "+decimal);*/
        
        String hexadecimal = "A";
        Integer decimal = Integer.parseInt(hexadecimal, 16);
        
        System.out.println("Decimal = "+decimal);
    }
}
