import java.util.*;

class student 
{
    int roll_no;
    student()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your roll no: ");
        roll_no = sc.nextInt();
    }

}
class test extends student
{
    int sub1;
    int sub2;
    float marks;

    test()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of subject1: ");
        sub1 = sc.nextInt();
        System.out.print("Enter marks of subject2: ");
        sub2=sc.nextInt();
        marks=(sub1+sub2)/2.0f;
    }

}
class result extends test
{

    result()
    {
        System.out.println("******information of student******");
    }

    void display()
    {
        System.out.println("roll_no: "+roll_no);
        System.out.println("subject1: "+sub1);
        System.out.println("subject2: "+sub2);
        System.out.println("result: "+marks);
    }
}
class multilevel_inheritance
{
    public static void main(String args[])
    {
        result b = new result();
        b.display();
    }
}