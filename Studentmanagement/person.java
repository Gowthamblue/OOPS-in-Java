public class person {
    private int id;
    private String name;
    private int age;
    private String address;
    public person(int id,String name,int age,String address)
    {
        this.id=id;
        this.name=name;
        this.age=age;
        this.address=address;
    }
    public person()
    {
        this.id=0;
        this.name="";
        this.age=0;
        this.address="";
    }
    public void setage(int age)
    {
        if(age>0)
        {
            this.age=age;
        }
        else
        {
            System.out.println("Enter a valid age");
        }
    }
    public void getage()
    {
        System.out.println("The Age is: "+this.age);
    }
    public void setname(String name)
    {
        if(name!=null)
        {
            this.name=name;
        }
        else
        {
            System.out.println("Enter a valid name");
        }
    }
    public void getname()
    {
        System.out.println("The Student name is: "+this.name);
        
    }
    public void setid(int id)
    {
        if(id>0)
        {
            this.id=id;
        }
        else
        {
            System.out.println("Enter the valid Id");
        }
    }
    public void getid()
    {
        System.out.println("The age is: "+this.age);
    }
    public void setaddress(String address)
    {
        if(address!=null)
        {
            this.address=address;
        }
        else
        {

            System.out.println("Enter the valid Address.");
        }
    }
    public void getaddress()
    {
        System.out.println("The address is :"+this.address);
    }
    public void display()
    {
        System.out.println("Id: "+this.id);
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Address: "+this.address);
    }
}
