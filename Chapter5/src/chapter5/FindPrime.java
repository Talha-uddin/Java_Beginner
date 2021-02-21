/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class FindPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isPrime;
        int num = input.nextInt();
        
        if(num < 2)
            isPrime = false;
        else
            isPrime = true;
        
        for(int i=2; i<=num/i; i++){
            if((num % i) == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
        
    }
}
