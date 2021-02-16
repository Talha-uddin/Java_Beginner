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
public class UpperTriangleLowerTriangele {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int A[][] = new int [3][3];
        int SumOfDiogonalElements = 0;
        int SumOfUpperElements = 0;
        int SumOfLowerElements = 0;
        
        for(int row=0; row<3; row++){
            for(int col=0; col<3; col++){
                A[row][col] = input.nextInt();
            }
        }
        
        for(int row=0; row<3; row++){
            for(int col=0; col<3; col++){
                if(row == col){
                    SumOfDiogonalElements = SumOfDiogonalElements + A[row][col];
                }
                if(row<col){
                    SumOfUpperElements = SumOfUpperElements + A[row][col];
                }
                if(row>col)
                {
                    SumOfLowerElements = SumOfLowerElements + A[row][col];
                }
            }
        }
        
        System.out.println("Sum of Diagonal Elements : "+SumOfDiogonalElements);
        System.out.println("Sum of Upper Elements : "+SumOfUpperElements);
        System.out.println("Sum of Lower Elements : "+SumOfLowerElements);
    }
}
