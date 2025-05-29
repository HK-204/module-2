public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addFirst("a");
        list.addLast("b");
        list.addFirst("c");
        list.add(1, "d");

        System.out.println("List: " + list);
        System.out.println("Index of a: " + list.indexOf("a"));
        MyLinkedList clonedList = list.clone();
        System.out.println("Cloned list: " + clonedList);
        System.out.println("Removed 'a': " + list.remove("a"));
        System.out.println("Element at index 2: " + list.get(2));
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        list.clear();
        System.out.println("List after clear: " + list);
        System.out.println("Cloned list after clear: " + clonedList);
    }
}
