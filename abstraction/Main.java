abstract class vehicle{
    abstract void start();
    abstract void breaka();
    void stop()
    {
        System.out.println("Vehicle is Stopping");
    }
}
class car extends vehicle
{
    void start()
    {
        System.out.println("Vehicle is start");
    }
    void breaka()
    {
        System.out.println("The break is pressed");
    }
    public void gt()
    {
        System.out.println("HELLO");
    }
}

public class Main{
    public static void main(String[] args) {
        car c =new car();
        c.start();
        c.stop();
        c.breaka();

    }


}