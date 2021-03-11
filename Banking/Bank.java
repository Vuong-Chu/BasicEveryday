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
        new Branch(name);
        return true;
    }

    private Branch findBranch(String name){
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransaction){
        return true;
    }


}
