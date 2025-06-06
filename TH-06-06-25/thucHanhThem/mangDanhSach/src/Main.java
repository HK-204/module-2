public class Main {
    public static void main(String[] args) {
        char[] str = "abcdefgh".toCharArray();
        System.out.println(binarySearch(str, 'e'));

    }

    static int binarySearch(char[] list, char value) {
        int low = 0;
        int high = list.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (list[mid] == value) {
                return mid;
            } else if (value < list[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}