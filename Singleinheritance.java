class animals
{
    void eat()
    {

        System.out.println("Animal eats.");
    }
}
class dog extends animals
{
    void barks()
    {
        System.out.println("THe Dog Barks.");
    }
}

public class singleinheritance
{
    public static void main(String args[])
    {

        dog ob =new dog();
        ob.eat();
        ob.barks();
    }
}
