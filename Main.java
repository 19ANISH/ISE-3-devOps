public class Main {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;

        while (count < 100) {
            boolean isPrime = true;

            // Check if num is prime
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }

            num++;
        }
    }
}
