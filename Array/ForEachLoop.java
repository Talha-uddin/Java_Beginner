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
public class ForEachLoop {
    public static void main(String[] args) {

        String names[] = {"Talha","Sudip","Tahmid","Maruf","Joy"};
        int num[] = {10,20,30,40,50,60,70,80,90,100};
        int sum = 0;
        for(String x : names){
            System.out.println(x);
        }
        for(int y : num){
            sum = sum + y;
        }
        System.out.println("The Sum is "+sum);
    }
}
