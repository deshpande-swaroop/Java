class Overriding
{
    public static void main(String Arg[])
    {
        Base bobj= new Derived();
        bobj.fun();//Derived fun
        bobj.gun();//Derived gun
        bobj.sun();//Base sun
        //bobj.run();//error
    }
}
class Base
{
    public void fun()
    {
        System.out.println("Base Fun");
    }
    public void gun()
    {
        System.out.println("Base Gun");
    }
    public void sun()
    {
        System.out.println("Base Sun");
    }
}
class Derived extends Base
{
    public void fun()
    {
        System.out.println("Derived Fun");
    }
    public void gun()
    {
        System.out.println("Derived Gun");
    }
    public void run()
    {
        System.out.println("Derived Run");
    }
}

