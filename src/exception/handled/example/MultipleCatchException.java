package exception.handled.example;

public class MultipleCatchException {
    public static void main(String[] args) {
        int a=10;
        int b=545;
        int res=0;
        try{
             res=a/b;
            System.out.println("res is:"+res);

            String msg1="Hi Developer";
            String msg2= null;
            System.out.println("length of the msg1 is:"+msg1.length());
            System.out.println("length of the msg2 is:"+msg2.length());


        }
        catch (ArithmeticException e){
            System.out.println("Exception occurred:"+e.getMessage()+"....."+e.getClass());

        }
        catch (NullPointerException e){
            System.out.println("Exception occurred:"+e.getMessage()+"....."+e.getClass());

        }

    }
}
