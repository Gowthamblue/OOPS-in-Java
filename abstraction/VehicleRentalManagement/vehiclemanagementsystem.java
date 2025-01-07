import java.util.Scanner;

public class vehiclemanagementsystem {
    public static void main(String[] args) {
        vehiclerentalsystem rentalSystem = new vehiclerentalsystem();
        vehicle car = new car("C001",300,30);
        vehicle truck = new trucks("T002", 500, 20);
        vehicle bike = new bikes("B007", 100, 50);
        rentalSystem.addvehicle(bike);
        rentalSystem.addvehicle(truck);
        rentalSystem.addvehicle(car);
        double total =0;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter any options");
            System.out.println("1.To Display Available Vehicles.");
            System.out.println("2.To rent a vehicle");
            System.out.println("3.To Return a vehicle");
            System.out.println("4.Search vehicle mileage");
            System.out.println("5.calculate total earnings");
            System.out.println("6.Exit");
            System.out.print("Enter a choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                {
                    rentalSystem.displayavailablity();
                    break;
                }
                case 2:
                {
                    System.out.print("Enter the vehicle Id to rent: ");
                    String d = sc.next();
                    System.out.print("Enter the number of days to rent: ");
                    int f = sc.nextInt();
                    rentalSystem.rentVehicles(d, f);
                    total=rentalSystem.calculatetotalearnings(1,total);
                    break;
                }
                case 3:
                {
                    System.out.print("Enter the vehicle Id to return ");
                    String g = sc.next();
                    rentalSystem.returnvehicle(g);
                    break;
                }
                case 4:
                {
                    System.out.print("Enter the minimum mileage: ");
                    double minm = sc.nextDouble();
                    System.out.print("Enter the maxmileage: ");
                    double maxm = sc.nextDouble();
                    rentalSystem.searchVehiclebymileage(minm, maxm);
                    break;
                }
                case 5:
                {
                    total=rentalSystem.calculatetotalearnings(1,total);
                    System.out.println("Total earning Rs: "+total);
                    break;
                }
                case 6:
                {
                    System.out.println("Successfully Exited");
                    return;
                }           
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    
}
