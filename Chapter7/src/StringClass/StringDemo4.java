//Java CommandLine this is a test 100 -1
package StringClass;

public class StringDemo4 {
    public static void main(String[] args) {
        String arg[] = {"This", "is", "a", "test", "100", "-1"};
        
        for(int i=0; i<arg.length; i++){
            System.out.println("args["+i+"]: "+arg[i]);
            
        }
    }
}
