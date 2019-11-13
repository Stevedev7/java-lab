import java.util.Scanner;
public class BeanDemo {
    public static void main(String args[]) {
        Person p = new Person();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name : ");
        p.setFirst_name(sc.nextLine());

        System.out.print("Enter last name : ");
        p.setLast_name(sc.nextLine());

        System.out.print("Enter id : ");
        p.setId(sc.nextInt());

        System.out.print("Enter the location : ");
        sc.nextLine();
        p.setLocation(sc.nextLine());
        
        System.out.println("\nPersonal Details:");
        System.out.println("First Name : "+p.getFirst_name()+"\nLast Name : "+p.getLast_name());
        System.out.println("ID : "+p.getId()+"\nLocation : "+p.getLocation());
        sc.close();
    }
}
