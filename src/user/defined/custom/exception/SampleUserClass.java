package user.defined.custom.exception;

public class SampleUserClass {
    public static void main(String[] args) {

        try {
            String user = null;
            if (user == null) {
                throw new UserNotFoundException("User Not Found");
            } else {
                System.out.println("user is present");
            }
        } catch (Exception e) {
            System.out.println("Exception is Occurred:" + e.getClass() + "------" + e.getMessage());
        }
    }
}