public class prime {
    public static void main(String[] args) {
        // StringBuilder to store prime numbers
        StringBuilder primeNumbers = new StringBuilder("Prime numbers from 1 to 100:\n");
        
        // Loop through numbers starting from 2
        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;
            
            // Check divisibility from 2 to the square root of num
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            // If num is prime, add to the result string
            if (isPrime) {
                primeNumbers.append(num).append(" ");
            }
        }
        
        // Print all prime numbers in a formatted list
        System.out.println(primeNumbers.toString());
    }
}
