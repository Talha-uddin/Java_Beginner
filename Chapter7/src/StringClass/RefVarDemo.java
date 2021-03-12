//local variable type interface with a useer-define class type
package StringClass;

class MyClass {

    private int i;

    MyClass(int k) {
        i = k;
    }

    int geti() {
        return i;
    }

    void seti(int k) {
        if (k >= 0){
            i = k;
        }
        
    }
}

public class RefVarDemo {

    public static void main(String[] args) {
        var mc = new MyClass(10);       //using of var here

        System.out.println("Value of i in mc is " + mc.geti());
        mc.seti(19);
        System.out.println("Value of i in mc is now " + mc.geti());
    }
}
