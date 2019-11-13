public class Employee {
    private String name;
    private int sal;

    public Employee(String n, int s){
        name = n;
        sal = s;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
    public int getSalary() {
        return sal;
    }
    public void setSalary(int sal) {
        this.sal = sal;
    }
    public String toString() {
        return(name + " ---> " + sal);
    }
}
