public class adminstaff extends person {
    String department;
    String role;
    public adminstaff(int id,String name,int age,String address,String dep,String role)
    {
        super(id, name, age, address);
        this.department=dep;
        this.role=role;
    }
    public void display()
    {
        super.display();
        System.out.println("Department: "+department);
        System.out.println("Role: "+role);
    }
    
}
