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
public class StringBufer {
    public static void main(String[] args) {
        
        String s1 = "Talha";
        StringBuffer sb = new StringBuffer(s1);
        System.out.println(sb);
        
        sb.append(" Uddin ");
        sb.append(25);
        System.out.println(sb);
        
        /*sb.reverse();
        System.out.println(sb);*/
        
        /*sb.delete(0, 5);
        System.out.println(sb);*/
    
         sb.setLength(5);
         System.out.println(sb);
    }
}
