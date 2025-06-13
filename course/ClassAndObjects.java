class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

public class ClassAndObjects {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 1;

        Calculator cal = new Calculator();

        int result = cal.subtract(12, 1);

        System.out.println(result);

    }
}

// /Object Oriented Programming
// Object-properties and behaviour

// Class-