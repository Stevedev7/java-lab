import java.util.*;
class CompareName implements Comparator<Employee>{
    public int compare(Employee e1, Employee e2){
        return(e1.getName().compareToIgnoreCase(e2.getName()));
    }
}
