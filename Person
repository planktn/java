public class Person {
    String name, location, occupation;
    int age;


    Person(String name, int age, String location, String occupation) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.occupation = occupation;   
    }
    void changeLocation(String newlocation)
    {
        location=newlocation;
        System.out.println(name + " has moved to " + location);
    }
    void promoteOccupation(String newoccupation)
    {
        occupation=newoccupation;
        System.out.println(name + " has been promoted to " + newoccupation);
    }
    void termination()
    {
        occupation="Terminated";
        System.out.println(name + " is now " + occupation);
    }
    void applyLeave(String leavetype, int days)
    {
        System.out.println(name + " has applied for " + days + " days of " + leavetype + " leave.");
    }
    void displayDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Location: " + location);
        System.out.println("Occupation: " + occupation);
    }
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30, "New York", "Engineer");
        person1.displayDetails();
        person1.changeLocation("San Francisco");
        person1.promoteOccupation("Senior Engineer");
        person1.applyLeave("Sick", 5);
         person1.displayDetails();
        person1.termination();
        person1.displayDetails();
    }
}
