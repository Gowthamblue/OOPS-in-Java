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
class cat extends dog
{
    void meow()
    {
        System.out.println("THe Cat Meows.");
    }
}



public class multilevelinheritance
{
    public static void main(String args[])
    {

        cat ob =new cat();
        ob.eat();
        ob.barks();
        ob.meow();
    }
}
