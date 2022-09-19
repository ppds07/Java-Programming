class SecondA
{
    int a,b;
    SecondA()
    {
        a=10;
        b=20;
    }
    void show()
    {
        System.out.println("A= "+a);
        System.out.println("B= "+b);
    }
    public static void main(String [] args)
    {
        SecondA obj = new SecondA();
        obj.show();                
    }
}