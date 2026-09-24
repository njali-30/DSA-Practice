public class Palindrome {
    public static void main(String[] args) {
        int original = 12321;
        int num = original;
        int reversed = 0;

        while (num > 0) {
            int rem = num % 10;
            reversed = reversed * 10 + rem;
            num = num / 10;
        }

        if (original == reversed) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}