import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Course_Registration_System {
    public static void main(String[] args)
    {
        HashMap<String, TreeSet<String>> registrations = new HashMap<>();
        System.out.println("*****Course Registration System*****");
        Scanner sc=new Scanner(System.in);
        String student_name, course_name;
        boolean run=true;
        System.out.println("1. Register a student for a course\n" +
                "2. Show all students and their courses\n"+
                "3. Show all courses of a specific student\n" +
                "4. Remove a specific course from a student\n"+
                "5. Count total students and total courses\n"+
                "6. Exit");
        System.out.print("Enter your choice: ");
        int choice=sc.nextInt();
        sc.nextLine();



    }
}
