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
public class Series2 {
    public static void main(String[] args) {
        int n,result=1;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the last number: ");
        n = input.nextInt();
        
        for(int i=1; i<=n; i = i+1){
            System.out.print(i+" ");
            result = result * i;
        }
        System.out.println();
        System.out.println(result);
    }
}
