class Calculator {

    int num = 5;// instance variable

    // Method Overloading same name different parameters

    public int add(int n1, int n2) {
        System.out.println(num);
        return n1 + n2;// local variable
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

}

public class Demo {
    public static void main(String[] args) {

        int data = 10;
        // cal is a reference variable
        Calculator cal = new Calculator();
        Calculator cal1 = new Calculator();

        int result = cal.add(12, 12, 12);

        cal.num = 12;

        System.out.println((result));
        System.out.println((cal.num));
        System.out.println((cal1.num));

    }
}
