class NewException extends Exception{
    @Override
    public void printStackTrace() {//no printStackTrace body
        //super.printStackTrace();
    }
}

public class Q13NoStackTrace {
    public static void main(String[] args) {
        try {
            throw new NewException();
        }
        catch (NewException e){
            e.printStackTrace();//nothing gets printed
        }
    }
}
