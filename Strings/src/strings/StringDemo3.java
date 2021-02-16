/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author DELL
 */
public class StringDemo3 {
    public static void main(String[] args) {
        String country = "   Bangladesh is    my country   ";
        System.out.println(country);
        
        String s3 = country.trim();
        System.out.println(s3);
        
        char ch = country.charAt(0);
        System.out.println("ch "+ch);
        
        int value = country.codePointAt(0);
        System.out.println("Value = "+value);
        
        int pos = country.indexOf('n');
        System.out.println("first position of n = "+pos);
        
        pos = country.lastIndexOf('n');
        System.out.println("last position of n = "+pos);
    }
}
