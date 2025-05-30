public class Counter {
    private boolean isBusy = true;
    private Customer customer;

    public boolean isBusy() {
        return isBusy;
    }

    public void serveCustomer(Customer customer) {
        this.customer = customer;
        isBusy = true;
    }

    public void finishServing() {
        this.customer = null;
        isBusy = false;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        if (isBusy) {
            return (customer != null) ?
                    "Busy, serving " + customer.getName() :
                    "Busy but not serving";
        } else {
            return "Not busy";
        }
    }
}
