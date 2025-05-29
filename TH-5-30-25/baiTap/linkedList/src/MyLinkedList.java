public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    public MyLinkedList() {
        head = null;
        numNodes = 0;
    }

    public void add(int index, E element) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }

        Node newNode = new Node(element);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }

        numNodes++;
    }

    public void addFirst(E e) {
        add(0, e);
    }

    public void addLast(E e) {
        add(numNodes, e);
    }

    public boolean add(E e) {
        addLast(e);
        return true;
    }

    public E remove(int index) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }

        Node removed;
        if (index == 0) {
            removed = head;
            head = head.next;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            removed = temp.next;
            temp.next = temp.next.next;
        }
        numNodes--;
        return (E) removed.data;
    }

    public boolean remove(Object e) {
        if (head == null) return false;

        if (e.equals(head.data)) {
            head = head.next;
            numNodes--;
            return true;
        }

        Node temp = head;
        while (temp.next != null && !temp.next.data.equals(e)) {
            temp = temp.next;
        }

        if (temp.next != null) return false;

        temp.next = temp.next.next;
        numNodes--;
        return true;
    }

    public int size() {
        return numNodes;
    }

    public MyLinkedList<E> clone() {
        MyLinkedList<E> clone = new MyLinkedList<>();
        Node temp = head;
        while (temp != null) {
            clone.add((E) temp.data);
            temp = temp.next;
        }
        return clone;
    }

    public boolean contains(E o) {
        return indexOf(o) != -1;
    }

    public int indexOf(E o) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data.equals(o)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity <= numNodes) {
            return;
        }

        Node current = head;
        if (current == null) {
            head = new Node(null);
            current = head;
            numNodes++;
        }

        while (current.next != null) {
            current = current.next;
        }

        while (numNodes < minCapacity) {
            current.next = new Node(null);
            current = current.next;
            numNodes++;
        }
    }

    public E get(int i) {
        if (i < 0 || i >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + i);
        }

        Node temp = head;
        for (int j = 0; j < i; j++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public E getFirst() {
        if (head == null) return null;
        return (E) head.data;
    }

    public E getLast() {
        if (head == null) return null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public void clear() {
        head = null;
        numNodes = 0;
    }

//    Thêm phương thức toString để có thể in ra danh sách
    @Override
    public String toString() {
        String result = "[";
        Node current = head;
        while (current != null) {
            result += current.data;
            if (current.next != null) {
                result += ", ";
            }
            current = current.next;
        }
        result += "]";
        return result;
    }
}
