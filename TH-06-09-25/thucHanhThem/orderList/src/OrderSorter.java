import java.util.ArrayList;

public class OrderSorter {
    public static void bubbleSort(ArrayList<Order> list) {
        boolean swapped = true;
        int size = list.size();

        for (int i = 1; i < size && swapped; i++) {
            swapped = false;
            for (int j = 0; j < size - i; j++) {
                if (list.get(j).getTotalAmount() < list.get(j + 1).getTotalAmount()) {
                    Order temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
