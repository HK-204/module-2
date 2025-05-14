public class giaTriNhoNhat {
    public static void main(String[] args) {
        int[] arr = {5,7,2,9,4,8,3,6,1};
        int index = minValue(arr);
        System.out.println("The smallest element is: " + arr[index]);
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
