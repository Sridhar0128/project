import java.util.Scanner;
class excep{
    void method(){
        try{
            System.out.println(3/0);
        }
        catch(ArithmeticException R){
            System.out.println(R.getMessage());
        }
        finally{
            System.out.println("Finally block");
        }
    }
}





class InvalidAgeException extends Exception {
    public InvalidAgeException (String message) {
        super(message);
    }
}

class CustomExceptionDemo {
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
                throw new InvalidAgeException("InvalidAgeException");
            } else {
                System.out.println("Welcome to vote!");
            }
        }

    public static void main(String[] args) {
        try {
            validateAge(16);
        } catch (InvalidAgeException e) {
            System.out.println("Caught the exception: " + e.getMessage());
        }

        try {
            validateAge(20);
        } catch (InvalidAgeException e) {
            System.out.println("Caught the exception: " + e.getMessage());
        }
    }
}
