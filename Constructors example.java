public class Main {
    public static void main(String args[])
    {
        parameterizedconstructor stu = new parameterizedconstructor(61,"Gowtham");
        stu.display();
        parameterizedconstructor stu1 =new parameterizedconstructor(stu);
        stu1.display();
        parameterizedconstructor stu2 =new parameterizedconstructor();
        stu2.display();

    }
    
}
class parameterizedconstructor {
    int roll;
    String name;
    // PARAMETERIZED CONSTRUCTOR
    public parameterizedconstructor(int a,String b)
    {
        this.roll =a;
        this.name=b;
    }
    // COPY CONSTRUCTOR
    public parameterizedconstructor(parameterizedconstructor ob)
    {
        this.roll=ob.roll;
        this.name=ob.name;
    }
    // NO ARGUMENT CONSTRUCTOR
    public parameterizedconstructor()
    {
        this.roll=9;
        this.name="Akash";
    }
    public void display()
    {
        System.out.println("The name is: "+this.name+"\nThe roll no. is: "+this.roll);
    }

    
}

