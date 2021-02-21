/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

/**
 *
 * @author DELL
 */
public class StringSwitch {
    public static void main(String[] args) {
        
        String str = "two";
        
        switch(str){
            case "one":
                System.out.println("one");
                break;
            case "two":
                System.out.println("two");
                break;
            case "three":
                System.out.println("three");
            default:
                System.out.println("no match");
                break;
            
        }
    }
}
