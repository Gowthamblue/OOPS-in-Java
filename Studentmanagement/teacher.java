public class teacher extends person{
    private String subject;
    private int salary;
    public teacher(int id,String name,int age,String address,String subject,int salary)
    {
        super(id, name, age, address);
        this.subject=subject;
        this.salary=salary;
    }
    public void setsubject(String subject)
    {
        this.subject=subject;
    }
    public void getsubject()
    {
        System.out.println("The subject is: "+this.subject);
    }
    public void setsalary(int sal)
    {
        this.salary=sal;
    }
    public void getsalary()
    {
        System.out.println("The Salary is: "+this.salary);
    }
    @Override
    public void display()
    {
        super.display();
        System.out.println("Subject: "+subject);
        System.out.println("Salary: "+salary);
        
    }
    
}
