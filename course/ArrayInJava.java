public class ArrayInJava {
    public static void main(String[] args) {
        int[] newarr = { 12, 45, 6, 2, 6, 3 };
        int[] arr = new int[4];
        for (int i = 0; i < newarr.length; i++) {

            System.out.println(newarr[i]);
            if (i < 4) {
                arr[i] = newarr[i];
                System.out.println("_____"+arr[i]);
            }

        }

    }
}
