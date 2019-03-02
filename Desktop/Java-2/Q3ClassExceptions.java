public class Q3ClassExceptions {
    public static void main(String[] args) {
        try
        {
            Class.forName("SomeClass");//ClassNotFoundException
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
        try {
            SomeClass geeks = new SomeClass();//NoClassDefFoundError
        }
        catch (NoClassDefFoundError ex)
        {
            ex.printStackTrace();
        }
    }
}