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
public class Pattern2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of line: ");
        int n = input.nextInt();
        
        for(int row=n; row>=1; row--){
            for(int cols=1; cols<=row; cols++){
                System.out.print(" "+cols);
            }
            System.out.println();
        }
    }
}
