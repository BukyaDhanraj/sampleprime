public class prime {
    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0, 1, and negative numbers are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Divisible by any number other than 1 and itself
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        int number = 2;

        System.out.println("First 10 prime numbers are:");
        while (count < 10) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}

