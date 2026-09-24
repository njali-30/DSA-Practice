public class SumArray {
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 9, 6, 3};

        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        System.out.println("Sum: " + total);
    }
}