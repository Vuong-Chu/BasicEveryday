import java.util.*;
//If we have comparable types, we use compareTo(); if not, we use equals().
public class ComparatorComparable {

    public static void main(String[] args) {
        List<Employee> listEmployee = new LinkedList<>();
        listEmployee.add(new Employee("Hanna",1, 20));
        listEmployee.add(new Employee("Larry",3, 22));
        listEmployee.add(new Employee("Peter",4, 25));
        listEmployee.add(new Employee("Henry",2, 19));
        listEmployee.add(new Employee("Sally", 5, 21));

        Comparator<Employee> ageComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.getAge()<o2.getAge()){
                    return -1;
                }else if(o1.getAge()>o2.getAge()){
                    return 1;
                }else{
                    return 0;
                }
            }
        };

        Collections.sort(listEmployee,ageComparator);
        System.out.println(listEmployee.toString());

        listEmployee.sort(Employee::compareTo);
        System.out.println(listEmployee.toString());
    }

}
class Employee implements Comparable<Employee>{
    private String name;
    private int age;
    private int id;

    public Employee(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String toString(){
        return name;
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(getId(),o.getId());
    }
}

