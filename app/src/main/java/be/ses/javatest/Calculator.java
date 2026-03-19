package be.ses.javatest;

public class Calculator {


    public float divide(float x, float y) {
        if (y == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return x / y;
    }
    public float multiply(float x, float y) {
        
        return x * y;
    }
    public float plus(float x, float y) {
        return x + y;
    }
    public float min(float x, float y) {
        return x - y;
    }
    public float vierkantswortel(float x) {
        if (x < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return (float) Math.sqrt(x);
    }
}