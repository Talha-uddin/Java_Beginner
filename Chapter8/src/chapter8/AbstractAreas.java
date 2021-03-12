//using abstract method and classes
package chapter8;

abstract class Figure{
    double dim1;
    double dim2;
    
    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }
}

class Rectangle extends Figure{
    Rectangle(double a, double b){
        super(a, b);
    }
    
    double area(){
        System.out.println("Inside area for Rectangle");
        return dim1 * dim2;
    }
}

class Triangle extends Figure{
    Triangle(double a, double b){
        super(a, b);
    }
    
    double area(){
        System.out.println("Inside area for Triangle");
        return dim1 * dim2/2;
    }
}

public class AbstractAreas {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 9);
        Rectangle figref;
        Triangle figre;
        figref = r;
        System.out.println("Area is "+figref.area());
        
        figre = t;
        System.out.println("Area is "+figref.area());
    }
}
