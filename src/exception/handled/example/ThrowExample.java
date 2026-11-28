package exception.handled.example;

public class ThrowExample {
    public static void main(String[] args) {

        try {
            int age = 0;

        if (age >= 18) {
            System.out.println("Age is Valid to Vote");

        } else {
            throw new RuntimeException("Age is Not valid to Vote!");
        }
    }
   catch (Exception e){
            System.out.println("Exception occurred:" + e.getMessage() + "-----" + e.getClass());
        }

    }
    }


