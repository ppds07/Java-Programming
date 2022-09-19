class Student
{
    int regno;
    String name,dept;
}
class Student_details
{
    public static void main(String [] args)
    {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.regno = 101;
        s1.name = "Ram";
        s1.dept = "CSE";
        s2.regno = 102;
        s2.name = "Ramesh";
        s2.dept = "CSE";
        s3.regno = 103;
        s3.name = "Rohan";
        s3.dept = "ECE";
        System.out.println(s1.regno+" "+s1.name+" "+s1.dept);
        System.out.println(s2.regno+" "+s2.name+" "+s2.dept);
        System.out.println(s3.regno+" "+s3.name+" "+s3.dept);
    }
}