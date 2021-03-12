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
        try{
            if(findCustomer(name)==null) {
                Customer newOne = new Customer(name);
                newOne.addTransaction(initialTransaction);
                customers.add(newOne);
            }
            return true;
        }catch (Exception e) {
            return false;
        }
    }
    public boolean addCustomerTransaction(String name, double transaction){
        try {
            findCustomer(name).addTransaction(transaction);
            return true;
        }catch (Exception e){
            return false;
        }
    }
    private Customer findCustomer(String name){
        for(Customer customer: customers){
            if(customer.getName().equals(name)){
                return customer;
            }
        }
        return null;

    }
}
