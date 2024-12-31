import java.util.*;
public class schoolmanagementsystem {
    public static void main(String args[])
    {
        ArrayList<person> people = new ArrayList<>();
        // Student 
        people.add(new student(61, "Gowtham", 19, "Velur", "A", 638182));
        people.add(new student(52, "Ganapathi", 20, "Dindigul", "O", 638282));
        // Teacher
        people.add(new teacher(9, "Akash", 29, "Namakkal", "Computer Science", 50000));
        people.add(new teacher(244, "Varun", 20, "Kanya", "Cloud", 70000));
        // Admin Staff
        people.add(new adminstaff(177, "Deepan", 32, "Salem", "ECE", "ASP"));
        people.add(new adminstaff(66, "Harirajan", 40, "Karur","Mech", "HOD"));
        System.out.println("Student Management System ");

        for(person p:people)
        {
            System.out.println("-------------------------------------------------------------------");
            p.display();
        }
        
        
    }
    
}
