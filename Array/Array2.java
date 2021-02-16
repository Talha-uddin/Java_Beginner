/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigginerjava.Array;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Array2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        double number[] = new double[5];

        System.out.print("Please Enter 5 Numbers: ");
        for (int i = 0; i < 5; i++) {
            number[i] = input.nextByte();
        }

        for (int i = 0; i < 5; i++) {
            sum = sum + number[i];
        }

        System.out.println("The Sum is : " + sum);

        double avg = sum / number.length;
        System.out.println("Average is: " + avg);
        
        double max = number[0];
        double min = number[0];
        
        for(int i=0; i<5; i++){
            if(max < number[i])
                max = number[i]; 
            if(min > number[i])
                min = number[i];
        }
        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);
    }
}
