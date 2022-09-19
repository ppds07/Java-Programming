import java.util.*;
class SecondB
{
    int a,b;
    SecondB(int x,int y)
    {
        a=x;
        b=y;
    }
    void show()
    {
        System.out.println("A= "+a);
        System.out.println("B= "+b);
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        SecondB obj = new SecondB(i1,i2);
        obj.show();                
    }
}