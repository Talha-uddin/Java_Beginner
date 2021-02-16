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
public class Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Element for A Matrix");
        int A[][] = new int[2][3];
        int B[][] = new int[2][3];
        
        for(int row=0; row<2; row++){
            for(int cols=0; cols<3; cols++){
                System.out.printf("A[%d][%d] = ",row,cols);
                A[row][cols] = input.nextInt();
            }
        }
        
        System.out.println("\nEnter Element for B Matrix");
        for(int row=0; row<2; row++){
            for(int cols=0; cols<3; cols++){
                System.out.printf("B[%d][%d] = ",row,cols);
                B[row][cols] = input.nextInt();
            }
        }
        
        System.out.println("A = ");
        for(int row=0; row<2; row++){
            for(int cols=0; cols<3; cols++){
                System.out.print("\t "+A[row][cols]);
            }
            System.out.println();
        }
        
        
        System.out.println("B = ");
        for(int row=0; row<2; row++){
            for(int cols=0; cols<3; cols++){
                System.out.print("\t "+B[row][cols]);
            }
            System.out.println();
        }
        
        //add A and B matrix
        System.out.println("A+B = ");
        for(int row=0; row<2; row++){
            for(int cols=0; cols<3; cols++){
                System.out.print("\t "+(A[row][cols] + B[row][cols]));
            }
            System.out.println();
        }
    }
}
