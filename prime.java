public class prime {
    public static void main(String[] args) {
        for (int num = 1; num <= 100; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && num > 1) {
                System.out.println(num);
            }
        }
    }
}
