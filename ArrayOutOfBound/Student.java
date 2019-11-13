import java.util.Scanner;
class Student{
    String name;
    String usn;
    public void read(int i){
        System.out.println("Student " + (i + 1));
        Scanner s = new Scanner(System.in);
        System.out.println("Enter student name");
        name = s.nextLine();
        System.out.println("Enter student usn");
        usn = s.nextLine();
    }
    public void display(){
        System.out.println(usn + " -> " + name);
    }
}
