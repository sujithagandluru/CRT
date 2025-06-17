
class Outer
{
    private int a=10;
     void o_m()
    {
        System.out.println("in outer class");
    }
    class Inner
    {
        void im()
        {
            System.out.println("in inner class a="+a);
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.o_m();
        Outer.Inner i=o.new Inner();
        i.im();
        //System.out.println(i.a);
        //i.o_m();
    }
}
