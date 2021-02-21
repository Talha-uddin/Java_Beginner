/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

/**
 *
 * @author DELL
 */
public class ForEach3 {
    public static void main(String[] args) {
        int sum = 0;
        int nums[][] = new int[3][5];
        
        //give sums some values
        for(int i=0; i<3; i++){
            for(int j=0; j<5; j++){
                nums[i][j] = (i+1)*(j+1);
            }
        }
        
        for(int x[]: nums){
            for(int y: x){
                System.out.println("Value is : "+y);
                sum += y; 
            }
        }
        System.out.println("Summation : "+sum);
    }
}
