import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyQueue<Employee> femaleQueue = new MyQueue<>();
        MyQueue<Employee> maleQueue = new MyQueue<>();

        List<Employee> list = new LinkedList<>();
        list.add(new Employee("Linh", "female", 10, 12, 2001));
        list.add(new Employee("Minh", "male", 5, 6, 2002));
        list.add(new Employee("Thao", "female", 27, 5, 2001));
        list.add(new Employee("Viet", "male", 27, 2, 2004));
        list.add(new Employee("Anh", "female", 28, 1, 2003));
        list.add(new Employee("Truong", "male", 16, 10, 2003));

        for (Employee e : list) {
            if (e.getGender().equals("female")) {
                femaleQueue.enqueue(e);
            } else if (e.getGender().equals("male")) {
                maleQueue.enqueue(e);
            } else {
                System.out.println("Invalid gender" + e);
            }
        }

        List<Employee> femaleList = femaleQueue.toList();
        List<Employee> maleList = maleQueue.toList();

        Collections.sort(femaleList, Employee.sortByBirthday);
        Collections.sort(maleList, Employee.sortByBirthday);

        System.out.println("Female List: ");
        for (Employee e : femaleList) {
            System.out.println(e);
        }
        System.out.println("Male List: ");
        for (Employee e : maleList) {
            System.out.println(e);
        }
    }
}