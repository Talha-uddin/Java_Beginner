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
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0,r,temp,num;
        System.out.println("Enter any number");
        num = input.nextInt();
        
        temp = num;
        while(temp != 0){
            r = temp % 10;
            sum = sum + r;
            temp = temp/10;
        }
        System.out.println("Sum of Digit- "+sum);
    }
    
}
