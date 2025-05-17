public class Student {
    String name;
    double grade;

    public Student() {}

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }


    public String displayInfo() {
        return "Name: " + getName() + ", Grade: " + getGrade();
    }
}
