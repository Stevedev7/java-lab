import java.util.*;
public class Demo {
    public static void main(String args[]) {
        TreeSet<Employee> emp1=new TreeSet<Employee>(new CompareName());
        emp1.add(new Employee("Naruto",100000));
        emp1.add(new Employee("Levi",5000));
        emp1.add(new Employee("Kakashi",49999));
        emp1.add(new Employee("Inaba",10));
        emp1.add(new Employee("Asta",69420));
        System.out.println("\nEmployee Details (Sorted based on name) : ");
        for(Employee employee:emp1) {
            System.out.println(employee);
        }
        TreeSet<Employee> emp2=new TreeSet<Employee>(new CompareSal());
        emp2.add(new Employee("Naruto",100000));
        emp2.add(new Employee("Levi",5000));
        emp2.add(new Employee("Kakashi",49999));
        emp2.add(new Employee("Inaba",10));
        emp2.add(new Employee("Asta",69420));
        System.out.println("\nEmployee Details (Sorted based on Salary) : ");
        for(Employee employee:emp2) {
            System.out.println(employee);
        }
    }
}
