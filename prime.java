public class prime {
    public static void main(String[] args) {
        // Loop through numbers from 2 to 100
        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;
            
            // Check divisibility from 2 to the square root of num
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;  // num is not prime if divisible by i
                    break;
                }
            }
            
            // If isPrime is still true, the number is prime
            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}
