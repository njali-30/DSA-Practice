public class Average {
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 9, 6, 3};

        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        double average = (double) total / arr.length;

        System.out.println("Average: " + average);
    }
}