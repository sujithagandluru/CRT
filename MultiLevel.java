class GParent{
    public void gm()
    {
        System.out.println("in grand parent");
    }
}
class Father extends GParent
{
    public void fm()
    {
        System.out.println("in father");
    }
}
class Child extends Father{
    void cm()
    {
        System.out.println("in child");
    }
}
public class MultiLevel {
    public static void main(String[] args) {
        Child c=new Child();
        c.gm();
        c.fm();
        c.cm();
    }
}
