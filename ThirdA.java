import java.util.*;
class Dummy
{
    String name,dept;
    int id;
    Scanner sc = new Scanner(System.in);
    
    void get()
    {
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter Department and ID: ");
        dept = sc.nextLine();
        id = sc.nextInt();               
        
    }
}
class ThirdA extends Dummy
{
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Department: "+dept);
        System.out.println("ID: "+id);
    }
    public static void main(String [] args)
    {
        ThirdA obj = new ThirdA();
        obj.get();
        obj.display();
    }
}
