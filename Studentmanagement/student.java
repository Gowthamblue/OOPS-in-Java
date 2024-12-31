public class student extends person {
    private String grade;
    private int pincode;
    public student(int id,String name,int age,String address,String grade,int pincode)
    {
        super(id,name,age,address);
        this.grade=grade;
        this.pincode=pincode;
    }
    public void setgrade(String grade)
    {
        this.grade=grade;
    }
    public String getgrade()
    {
        return this.grade;
    }
    public void setpincode(int pincode)
    {
        this.pincode=pincode;
    }
    @Override
    public void display()
    {
        super.display();
        System.out.println("Grade: "+grade);
        System.out.println("Pincode: "+pincode);
    }

    
}