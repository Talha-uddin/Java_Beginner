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
public class StringDemo1 {
    public static void main(String[] args) {
        String s1 = "talha Uddin";
        String s2 = new String("Talha Uddin");
        
        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);
        
        int len = s1.length();
        System.out.println("Length of S1 = "+len);
        
        if(s1.equalsIgnoreCase(s2))
            System.out.println("Equals");
        else
            System.out.println("Not Equals");
        
        boolean con = s1.contains("tal");
        System.out.println(con);
        
        boolean b = s1.isEmpty();
        System.out.println("b = "+b);
    }
}
