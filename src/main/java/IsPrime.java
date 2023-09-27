public class IsPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(29));
        System.out.println(isPrime(35));
        System.out.println(isPrime(20));
        System.out.println(isPrime(27));
        System.out.println(isPrime(7));
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
