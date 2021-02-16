/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigginerjava.Pattern;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Pattern1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the line number: ");
        int n = input.nextInt();
        int row,cols;
        
        for(row=1; row<=n; row++){
            for(cols=1; cols<=row; cols++){
                System.out.print(" "+cols);
            }
            System.out.println();
        }
    }
}
