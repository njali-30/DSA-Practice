public class SumOfDigits {
    public static void main(String[] args) {
        int num = 12345;
        int total = 0;

        while (num > 0) {
            int rem = num % 10;
            total += rem;
            num = num / 10;
        }

        System.out.println("Sum of Digits: " + total);
    }
}