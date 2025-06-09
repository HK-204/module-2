public class InsertionSort {
    static int[] list = {4, 6, 7, 1, 9, 23, 45, 88, 12, 3, 90, 2};

    public static void main(String[] args) {
        insertionSort(list);
        System.out.println("Sorted List: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static void insertionSort(int[] list) {
        int pos, x;
        for (int i = 1; i < list.length; i++) {
            x = list[i];
            pos = i;
            while (pos > 0 && list[pos - 1] > x) {
                System.out.println("Change " + x + " to " + list[pos - 1]);
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = x;
        }
    }
}
