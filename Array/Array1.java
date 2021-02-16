/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigginerjava.Array;

/**
 *
 * @author DELL
 */
public class Array1 {
    public static void main(String[] args) {
        int number[] = new int[10];
        number[0] = 10;
        number[1] = 20;
        number[2] = 40;
        number[3] = 30;
        number[4] = 50;
        
        int sum = number[0]+number[1]+number[2]+number[3]+number[4];
        System.out.println("Sum = "+sum);
        int len = number.length;
        System.out.println("Array Size: "+len);
    }
}
