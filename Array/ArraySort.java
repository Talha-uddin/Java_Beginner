
package bigginerjava.Array;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int number[] = {10,-3,9,18,5};
        
        Arrays.sort(number);
        
        System.out.println("Assending: ");
        for(int i=0; i<5; i++){
            System.out.print(" "+number[i]);
        }
        System.out.println();
        System.out.println("Desending: ");
        for(int i=4; i>=0; i--){
            System.out.print(" "+number[i]);
        }
        System.out.println();
        
        String names[] = {"Joy","Muaz","Tahmid","Maruf"};
        Arrays.sort(names);
        for(int i=0; i<4; i++){
            System.out.print(names[i]+" ");
        }
        System.out.println();
        
        for(int i=3; i>=0; i--){
            System.out.print(names[i]+" ");
        }
        System.out.println();
    }
}
