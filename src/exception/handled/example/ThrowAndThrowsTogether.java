package exception.handled.example;

public class ThrowAndThrowsTogether {
     static void Withdraw(int balance,int amount)
        throws Exception {
           if( amount>balance){
               throw new RuntimeException  ("Insufficient Balance");
            }
           else{
               System.out.println("Withdraw successful");
           }

}

        public static void main(String[] args){
                 try {
                     Withdraw(2000, 560);
                     }
                 catch(Exception e){
                         System.out.println(e.getMessage());
                     }
                 }
             }
