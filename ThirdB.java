import java.util.*;
class ProcessStart
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
class Processing extends ProcessStart
{
    void lol()
    {
        System.out.println("Processing Data");
    }
}
class ThirdB extends ProcessStart
{
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Department: "+dept);
        System.out.println("ID: "+id);
    }
    public static void main(String [] args)
    {
        ThirdB obj = new ThirdB();
        Processing ob = new Processing();
        obj.get();
        ob.lol();
        obj.display();
    }
}
