
package chapter7;
class Stack{
    private int stck[];
    private int tos;
    
    Stack(int size){
        stck = new int[size];
        tos = -1;
    }
    
    void push(int item){
        if(tos == stck.length-1)
            System.out.println("Stack is Full");
        else
            stck[++tos] = item;
    }
    
    int pop(){
        if(tos < 0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            return stck[tos--];
        }
    }
}

public class TestStack2 {
    public static void main(String[] args) {
        Stack mystack1 = new Stack(5);
        Stack mystack2 = new Stack(8);
        
        //pushing
        for(int i=0; i<5; i++)
            mystack1.push(i);
        for(int i=0; i<8; i++)
            mystack2.push(i);
        
        //poping
        System.out.println("Stack in mystack1:");
        for(int i=0; i<5; i++){
            System.out.println(mystack1.pop());
        }
        
        System.out.println("Stack in mystack2:");
        for(int i=0; i<8; i++){
            System.out.println(mystack2.pop());
        }
    }
}
