package user.defined.custom.exception;

public class UserNotFoundException extends Exception{
    public  UserNotFoundException(){

    }
    public UserNotFoundException(String Message){
        super(Message);
    }
}
