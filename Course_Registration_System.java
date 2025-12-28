import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Course_Registration_System {
    public static void main(String[] args)
    {
        HashMap<String, HashSet<String>> registrations = new HashMap<>();
        System.out.println("*****Course Registration System*****");
        Scanner sc=new Scanner(System.in);
        String student_name, course_name;
        boolean run=true;


        do {
            System.out.println("1. Register a student for a course\n" +
                    "2. Show all students and their courses\n" +
                    "3. Show all courses of a specific student\n" +
                    "4. Remove a specific course from a student\n" +
                    "5. Count total students and total courses\n" +
                    "6. Exit");
            System.out.print("Enter your choice: ");
            int choice=sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the Students name: ");
                    student_name = sc.nextLine();
                    System.out.print("Enter course name: ");
                    course_name = sc.nextLine();
                    registrations.putIfAbsent(student_name, new HashSet<>());
                    registrations.get(student_name).add(course_name);
                    System.out.println(student_name + " registered for " + course_name);
                    break;

                case 2:
                    System.out.println(registrations);
                    break;

                case 3:
                    System.out.print("Enter the students name: ");
                    student_name = sc.nextLine();
                    if (registrations.containsKey(student_name)) {
                        System.out.println("Courses of " + student_name + " are:");
                        for (String course : registrations.get(student_name)) {
                            System.out.println(course);
                        }
                    } else {
                        System.out.println("No Student Found in this name :" + student_name);
                    }
                    break;

                case 4:
                    System.out.print("Enter the Student Name: ");
                    student_name = sc.nextLine();
                    if(registrations.containsKey(student_name)){
                        System.out.println("Courses of " + student_name + " are:");
                        for (String course : registrations.get(student_name)) {
                            System.out.println(course);
                        }
                        System.out.print("Enter the course you want to remove: ");
                        course_name = sc.nextLine();
                        registrations.get(student_name).remove(course_name);
                        System.out.println(course_name + " is been removed.");
                    }else {
                        System.out.println("No Student Found in this name :" + student_name);
                    }
                    break;

                case 5:
                    System.out.print("The total count of student is :");
                    int studentsize = registrations.size();
                    System.out.println(studentsize);
                    int totalcourses = 0;
                    for (HashSet<String> students : registrations.values()) {
                        totalcourses += students.size();
                    }
                    System.out.println("Total number of Course is: " + totalcourses);
                    break;

                case 6:
                    System.out.println("Exiting....");
                    run = false;
                    System.out.println("----------------------------");
                    break;

                default:
                    System.out.println("Wrong option");
                    break;
            }
        }while(run);
    }
}
