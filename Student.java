import java.util.*;
public class Student {
    String name,usn,branch;
    int sem;
    int m1,m2,m3,t;
    double perc;
    void study() {
        System.out.println("Student is studying");
    }
    Student(String name, String usn, String branch, int sem) {
        super();
        this.name = name;
        this.usn = usn;
        this.branch = branch;
        this.sem = sem;
    }
    void get_marks(){
        Scanner sc = new Scanner(System.in);
        this.m1 = sc.nextInt();
        this.m2 = sc.nextInt();
        this.m3 = sc.nextInt();
        this.t = m1 + m2 + m3;
        this.perc = (t / 3);
        sc.close();
    }
    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("USN: " + this.usn);
        System.out.println("Branch: " + this.branch);
        System.out.println("Semester: " + this.sem);
        System.out.printf("percentage:%.2f", this.perc);
    }
    public static void main(String args[]) {
        Student s1 = new Student("bob","212ffd","ec",3);
        s1.study();
        s1.display();
        s1.get_marks();
        s1.display();
    }
}
