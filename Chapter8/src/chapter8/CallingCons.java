package chapter8;

class A {

    A() {
        System.out.println("Inside A's Constructors");
    }
}

class B extends A {

    B() {
        System.out.println("Inside B's COnstructors");
    }
}

class C extends B {

    C() {
        System.out.println("Inside C's Constructors");
    }
}

public class CallingCons {

    public static void main(String[] args) {
        C c = new C();
    }
}
