public class soNguyenTo {
    public static void main(String[] args) {
        System.out.println("So nguyen to nho hon 100");

        int number = 2;
        while (number < 100) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
            number++;
        }
    }

    public static boolean isPrime (int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
