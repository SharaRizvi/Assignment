class MyException extends Exception{

}
public class Q6TryCatchFinally {
    public static void main(String[] args) {
        try {
            System.out.println("Inside Try->");
            System.out.println("Stuck in a problem.. ");
            throw new MyException();
        }
        catch (MyException e){
            System.out.println("Inside Catch1->");
            System.out.println("Caught by MyException");
        }
        catch (Exception e){
            System.out.println("Inside Catch2->");
            System.out.println("Caught by Exception");
        }
        finally {
            System.out.println("Inside Finally->");
            System.out.println("And program didn't stop abruptly");
        }
        System.out.println("Outside try-catch-finally block->");
        System.out.println("Thanks to try-catch-finally block");
    }
}
