import java.util.*;

public class vehiclerentalsystem {

        private List<vehicle> inventory ;
        public vehiclerentalsystem()
        {
            this.inventory=new ArrayList<>();
        }
        public void addvehicle(vehicle Vehicle)
        {
            inventory.add(Vehicle);
        }
        public void displayavailablity()
        {
            System.out.println("Available vehicles: ");
            for(vehicle u:inventory)
            {
                if(u.isAvailable())
                {
                    System.out.print("The vehicleId : "+u.getId()+ " Mileage: "+u.getmileage()+" ");
                    System.out.println();
                }
            }
        }
        public void rentVehicles(String id,int days)
        {
            for(vehicle v:inventory)
            {
                if(v.getId().equals(id) && v.isAvailable())
                {
                    v.setAvailable(false);
                    System.out.println("Vehicle "+id+" rentend for "+days+" is rentend and the Totalcost is "+v.getrentalcost(days));
                    return;
                }
            }
            System.out.println("Vehicle is not available or not found");
        }
        public void returnvehicle(String id)
        {
            for(vehicle v:inventory)
            {
                if(v.getId().equals(id) && !v.isAvailable())
                {
                    v.setAvailable(true);
                    System.out.println("The vehicle "+id+" is Returned");
                    return;
                }
            }
            System.out.println("Vehicle is already returned or available");
        }
        public void searchVehiclebymileage(double minMileage,double maxMileage)
        {
            System.out.println("Vehicle available within the mileage");
            for(vehicle v:inventory)
            {
                if(v.getmileage()>=minMileage && v.getmileage()<=maxMileage)
                {
                    System.out.println("Vehicle id: "+v.getId()+" Mileage: "+v.getmileage());
                }
            }
        }
        public double calculatetotalearnings(int days,double total)
        {
            for(vehicle v:inventory)
            {
                if(!v.isAvailable())
                {
                    total+=v.getrentalcost(days);
                }
            }
            return total;
        }

}
    

