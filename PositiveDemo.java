/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigginerjava;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class PositiveDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num; 
        System.out.print("Enter any integer: ");
        num = input.nextInt();
        
        if(num > 0){
            System.out.println("Positive");
            }
        else if(num < 0) {
            System.out.println("Negative");
        }
        else{
            System.out.println("Equal to zero");
        }
    }
}
