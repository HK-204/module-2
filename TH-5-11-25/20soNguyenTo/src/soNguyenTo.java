public class soNguyenTo {
    public static void main(String[] args) {
        System.out.println("20 so nguyen to dau tien");

        int count = 0;
        int number = 2;

        while (count < 20) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
