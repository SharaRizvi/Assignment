public class Q2Lambda {
    @FunctionalInterface
    interface Take2Return1 {
        int method(int a, int b);
    }

    public static void main(String[] args) {
        Take2Return1 object=(a, b)->a+b;
        System.out.println(object.method(10,15));
    }
}
