class Calculator {

    // Method Overloading same name different parameters

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

}

public class Demo {
    public static void main(String[] args) {

        Calculator cal = new Calculator();
        int result = cal.add(12, 12, 12);
        System.out.println((result));

    }
}
