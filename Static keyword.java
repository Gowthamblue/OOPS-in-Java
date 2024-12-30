class mobile{
    public String brand;
    public double price;
    static String name;
    public void display()
    {
        System.out.println("Brand: "+brand);
        System.out.println("Price: "+price);
        System.out.println("Name: "+name);
    }
    public static void show(mobile ob)
    {
        System.out.println("Brand: "+ob.brand);
        System.out.println("Price: "+ob.price);
        System.out.println("Name: "+name);
    }
}

public class Main {
    public static void main(String args[])
    {
        mobile m = new mobile();
        m.brand = "Apple";
        m.price = 80000;
        mobile.name = "Phone";
        m.display();
        mobile m1 = new mobile();
        m1.brand = "Poco";
        m1.price = 12000;
        m1.display();
        
    }
    
    
}
