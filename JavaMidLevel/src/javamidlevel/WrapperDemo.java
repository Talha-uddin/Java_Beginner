/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamidlevel;

/**
 *
 * @author DELL
 */
public class WrapperDemo {
    public static void main(String[] args) {
        //Premitive ->object
        int x = 30;
        Integer y = Integer.valueOf(x);
        System.out.println("y = "+x);
        //auto boxing
        Integer z = x; //Integer.valurOf();
        System.out.println("z = "+z);
        
                
              //unboxing
        Double d = new Double(10.25);
        System.out.println("d = "+d);
        
        double e = d.doubleValue();
        System.out.println("e = "+d);
        
        
    }
}
