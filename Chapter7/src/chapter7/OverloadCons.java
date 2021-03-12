/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7;

class Box{
    double width;
    double height;
    double depth;
    
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    
    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }
    //constractor use when cube is created
    Box(double len){
        width = height = depth = len;
    }
    
    double volume(){
        return width * height * depth;
    }
}

public class OverloadCons {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        
        double vol;
        //volume to the first box
        vol = mybox1.volume();
        System.out.println("Volume of firstbox is "+vol);
        //second box
        vol = mybox2.volume();
        System.out.println("Volume of secondbox is "+vol);
        
        //volume to the cube
        vol = mycube.volume();
        System.out.println("Volume of mycube is "+vol);
    }
}
