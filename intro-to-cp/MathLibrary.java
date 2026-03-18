public class MathLibrary{
    public MathLibrary() {
        // Constructor can be empty or used for initialization if needed
    }
    public static int addnums(int a, int b){
        return a + b;
    }
    public static int subnums(int a, int b){
        return a - b;
    }
    public static int mulnums(int a, int b){
        return a * b;
    }
    public static int divnums(int a, int b){
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}