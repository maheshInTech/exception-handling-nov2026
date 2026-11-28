package exception.handled.example;

public class FinallyExample {
    public static void main(String[] args) {


        int a = 545;
        int b = 0;
        int res = 0;
        try {
            res = a/b;
            System.out.println("res is:" + res);

            String msg1 = "Hi Developer";
            String msg2 = null;
            System.out.println("length of the msg1 is:" + msg1.length());
            System.out.println("length of the msg2 is:" + msg2.length());

        }
//        catch (Exception e) {
//            System.out.println("Exception occurred:" + e.getMessage() + "....." + e.getClass());
//
//        }
//
          finally {
            System.out.println("a is:"+a);
            System.out.println("b is:"+b);

            System.out.println("res is:"+res);
        }
    }
}
