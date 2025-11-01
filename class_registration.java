import java.util.Scanner;
import java.util.TreeSet;

public class class_registration {
    public static void main(String[] args){

        String name;
        Scanner sc = new Scanner(System.in);
        TreeSet<String> student_name = new TreeSet<>();
        System.out.print("Enter the number of Students : ");
        int count=sc.nextInt();
        sc.nextLine();
        for(int i=1; i<=count; i++)
        {
            System.out.print("Name: ");
            name=sc.nextLine();
            if(student_name.contains(name)){
                System.out.println(name+" already present");
                System.out.println("_________________________________");
            }else {
                student_name.add(name);
                System.out.println(name+ " Added");
                System.out.println("_________________________________");
            }
        }
        System.out.println();
        System.out.println("Total Unique Students is : "+student_name.size());
        System.out.print("The List of Students is : "+ student_name);

    }
}
