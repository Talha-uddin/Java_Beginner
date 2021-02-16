/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigginerjava.Array.Arrray1;

/**
 *
 * @author DELL
 */
public class TwoDArray3 {
    public static void main(String[] args) {
    int number[][] = new int[4][];
    int k=0;
    
    number[0] = new int[5];
    number[1] = new int[5];
    number[2] = new int[5];
    number[3] = new int[5];
    
    for(int i=0; i<4; i++){
        for(int j=0; j<i+1; j++){
            number[i][j] = k;
            k++;
        }
    }
    
    for(int i=0; i<4; i++){
        for(int j=0; j<i+1; j++){
            System.out.print(" "+number[i][j]);
        }
        System.out.println();
    }
    
    }
}
