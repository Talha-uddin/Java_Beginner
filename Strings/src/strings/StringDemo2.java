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
public class StringDemo2 {
    public static void main(String[] args) {
        String firstName = "Talha";
        String lastName = " Uddin";
        
        //String fullName = firstName + lastName;
        String fullName = firstName.concat(lastName);
        System.out.println("Full Name = "+fullName);
        
        String upperName = fullName.toUpperCase();
        System.out.println("Uppername = "+upperName);
        
        String lowerName = fullName.toLowerCase();
        System.out.println("Uppername = "+lowerName);
        
        boolean b = firstName.startsWith("Tal");
        System.out.println("b = "+b);
        
        boolean last = lastName.endsWith("n");
        System.out.println("Last = "+last);
        
        String names[] = {"talha","tanzil","muaz"};
        for(String x : names){
            System.out.print(" "+x);
        }
    }
}
