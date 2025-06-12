public class TypeConversion {
    public static void main(String[] args) {
        // byte b = 127;
        byte b = 10;
        byte a = 30;
        // int a = 257;
        byte k = (byte) a;

        float f = 5.6f;
        int t = (int) f;
        int result = a * b;
        System.out.println(result);
    }
}
