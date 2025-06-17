class Mother
{
    void mm()
    {
        System.out.println("in mother");
    }
}
class Child1 extends Mother
{
    void cm1()
    {
        System.out.println("in child1");
    }
}
class Child2 extends Mother
{
    void cm2()
    {
        System.out.println("in child2");
    }
}
class Hierarchial
{
    public static void main(String[] args) {
        Child2 c=new Child2();
        c.mm();
        c.cm2();

        Child1 c1=new Child1();
        c1.mm();
        c1.cm1();
    }
}