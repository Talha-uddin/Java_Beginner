/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter10;

public class NestTry {

    public static void main(String[] args) {
        try {
            int a = args.length;

            System.out.println("a = " + a);

            try {
                if (a == 1) {
                    a = a / (a - a);
                }

                if (a == 2) {
                    int c[] = {1};
                    c[42] = 99;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Index out-of bounds");
            }
        } catch (ArithmeticException e) {
            System.out.println("Devide by 0: " + e);
        }

    }
}
