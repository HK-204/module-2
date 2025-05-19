public class Student {
    private String name;
    private int id;
    private static int nextId = 1000;


    Student(String name) {
        this.name = name;
        this.id = nextId++;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
