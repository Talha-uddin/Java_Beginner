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
public class StringDemo4 {
    public static void main(String[] args) {
        String s1 = " This is my country";
        System.out.println(s1);
        
        String s2 = s1.replace('i', 'j');
        System.out.println(s2);
        
        String[] s3 = s1.split(" ");
        for(String x : s3){
            System.out.println(x);
        }
    }
}
