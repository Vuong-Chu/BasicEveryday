package Banking;

import java.util.ArrayList;
import java.util.List;

public class Branch {
    private String name;
    private List<Customer> customers;

    Branch(String name){
        this.name = name;
        customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Customer> getCustomers() {
        return customers;
    }
    public boolean newCustomer(String name, double initialTransaction){
        return true;
    }
    public boolean addCustomerTransaction(String name, double transaction){
        return true;
    }
    private Customer findCustomer(String name){
        return null;
    }
}
