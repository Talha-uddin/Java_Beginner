
package chapter6;

class Box{
    double width;
    double height;
    double depth;
}

//This class declears an object of type Box
public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;
        
        //assign value to mybox instance variables
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;
        
        //compute volume of box
        vol = mybox.width * mybox.height * mybox.depth;
        
        System.out.println("Volume is : "+vol);
    }
}
