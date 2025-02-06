package Programs;

public class primeornot {
    public static void main(String [] args) {
        System.out.println("prime numbers up to 100");
        for (int i = 2; i <= 100; i++) {
            boolean isprime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                System.out.println(i + ",");
            }
        }
    }
    }

