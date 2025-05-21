public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new FullTimeEmployee("Minh", 9000000);
        employees[1] = new PartTimeEmployee("Hoang", 150, 30000);
        employees[2] = new Intern("Trung", 2500000);
        employees[3] = new FullTimeEmployee("Mai", 9000000);
        employees[4] = new PartTimeEmployee("Huong", 180, 30000);

        for (Employee employee : employees) {
            System.out.println(employee.toString());
            if (employee instanceof Intern) {
                 ((Intern) employee).attendTraining();
            }
            System.out.println("--------------");
        }
    }
}
