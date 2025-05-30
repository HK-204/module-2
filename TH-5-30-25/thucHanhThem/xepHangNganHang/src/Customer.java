public class Customer {
    private String name;
    private int id;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {return name;}
    public int getId() {return id;}

    @Override
    public String toString() {
        return "Customer [name=" + getName() + ", id=" + getId() + "]";
    }
}
