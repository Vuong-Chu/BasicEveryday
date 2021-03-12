package Banking;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Branch> branches;

    Bank(String name){
        this.name = name;
        branches = new ArrayList<>();
    }

    public boolean addBranch(String name){
        try {
            if(findBranch(name)==null) {
                branches.add(new Branch(name));
            }
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction){
        try{
            findBranch(branchName).newCustomer(customerName, initialTransaction);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        try{
            findBranch(branchName).addCustomerTransaction(customerName, transaction);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    private Branch findBranch(String name){
        for(Branch branch: branches){
            if(branch.getName().equals(name)){
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransaction){
        System.out.println("Customer details for branch "+branchName);
        if(printTransaction) {
            try {
                for (Customer customer : findBranch(branchName).getCustomers()) {
                    System.out.println("Customer: " + customer);
                }
                return true;
            } catch (Exception e) {
                return false;
            }
        }else{
            try {
                int i=1;
                for (Customer customer : findBranch(branchName).getCustomers()) {
                    System.out.println("["+ i++ +"]" +" Customer: " + customer.getName());
                    int j=1;
                    System.out.println("Transactions:");
                    for(double transaction: customer.getTransactions()){
                        System.out.println("["+ j++ +"]" + "Amount: "+transaction);
                    }
                    System.out.println();
                }
                return true;
            } catch (Exception e) {
                return false;
            }
        }
    }


}
