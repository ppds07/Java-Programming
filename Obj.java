import java.util.*;
public class Obj {
    int a,b;
    String name;
    void setname(String name)
    {
        System.out.println("Student Name: "+name);
    }
    void setrn(String rno)
    {
        System.out.println("Student Roll Number: "+rno);
    }
    void setcn(String cno)
    {
        System.out.println("Student Contact Number: "+cno);
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        Obj ll = new Obj();
        String inpname;
        String rollname,cono;
        System.out.println("Enter the name: ");
        inpname = sc.nextLine();
        System.out.println("Enter the Roll Number: ");
        rollname = sc.nextLine();
        System.out.println("Enter Contact Number: ");
        cono = sc.nextLine();
        ll.setname(inpname);
        ll.setrn(rollname);
        ll.setcn(cono);      
    }
    
}
