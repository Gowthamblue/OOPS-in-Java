interface Animal
{
    void sound();

}
interface  pet{
    void play();
}
interface fly
{
    void canfly();
}
class dog implements Animal,pet{
    public void sound(){
        System.out.println("dog barks.");
    }
    public void play()
    {
        System.out.println("dog plays.");
    }
}
class Bird implements Animal,fly{
    public void canfly()
    {
        System.out.println("Birds can fly");
    }
    public void sound()
    {
        System.out.println("Birds can sound");
    }

}
public class interface1{
    public static void main(String args[])
{
 dog d=new dog();
 Bird b = new Bird();
 b.canfly();
 b.sound();
 d.play();
 d.sound();
}
}