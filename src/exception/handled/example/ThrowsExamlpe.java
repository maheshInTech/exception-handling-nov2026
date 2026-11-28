package exception.handled.example;

public class ThrowsExamlpe {
public static void demo() throws InterruptedException,  IllegalAccessException{


    int a=20;
    if(a==10){
        throw new ArithmeticException("a is 10, it is unchecked exception");
    }
    if(a==20){
        throw new InterruptedException("a is 10, it is checked exception");
    }
    if(a==30){
        throw new NullPointerException("a is 10, it is unchecked exception");
    }
    if(a==40){
        throw new IllegalAccessException("a is 10, it is checked exception");
    }


    }

    public static void main() {
    try {
        ThrowsExamlpe.demo();
    }
    catch (Exception e){
        System.out.println("Exception is occurred:"+e.getMessage()+"------"+e.getClass());
    }

    }
}
