public class opmain {
    public static void main(String[] args) {
        employee g =new employee(61,"Gowtham",50000);
        g.disp();
        employee e1 = new employee();
        //Setter
        e1.setid(7);
        e1.setname("Dhoni");
        e1.setsalary(7000000);
        e1.disp();
        //using getter
        System.out.println(e1.getid());
        System.out.println(e1.getname());
        System.out.println(e1.getsalary());
        
    }
    
}
class employee {
    private int id;
    private String name;
    private double salary;
    public employee(int id,String name,double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public employee()
    {
        this.id=0;
        this.name="";
        this.salary=0;
    }
    public int getid()
    {
        return this.id;
    }
    public void setid(int id)
    {
        if(id>0)
        {
            this.id=id;
        }
        else
        {
            System.out.println("Enter the valid id.");
        }
    }
    public String getname()
    {
        return this.name;

    }
    public void setname(String name)
    {
        if(name!=null && !name.isEmpty())
        {
            this.name=name;

        }
        else
        {
            System.out.println("Enter a valid String");
        }
    }
    public double getsalary()
    {
        return this.salary;
    }
    public void setsalary(double salary)
    {
        if(salary>0)
        {
            this.salary=salary;
        }
        else
        {
            System.out.println("Enter the Valid salary.");
        }
    }
    public void disp()
    {
        System.out.println("The person name : "+this.name+"\nThe person id : "+this.id+"\nThe person Salary : "+this.salary);
    }

    
}
