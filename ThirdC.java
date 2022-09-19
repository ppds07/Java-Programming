import java.util.*;
class ThirdCC
{
    void infoo()
    {
        System.out.println("Name: Ram");
        System.out.println("Dept: CSE");
        System.out.println("ID: 991");
    }
}
class Eprocess extends ThirdCC
{
    void processin()
    {
        System.out.println("Your Data is Processing");
    }
}
class ThirdC extends Eprocess
{
    void display()
    {
        System.out.println("The Entry is Successful");
    }
    public static void main(String[] args)
    {
        ThirdC obj = new ThirdC();
        obj.infoo();
        obj.processin();
        obj.display();
        
    }
}