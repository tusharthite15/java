import java.util.*;
class Add
{
    int add;
    int a, b;
    Add()
    {
        System.out.print("Enter two integers for Addition: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        add=a+b;
    }
    void display()
    {
        System.out.println("Addition: "+add);
    }
}
class Sub extends Add
{
    int sub;
    Sub()
    {
        System.out.print("Enter two integers for Substraction: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        sub=a-b;
    }
    void display()
    {
    System.out.println("Substraction: "+sub);
    }
}
class Mul extends Add
{
    int mul;
    Mul()
    {
        System.out.print("Enter two integers for Multiplication: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        mul=a*b;
    }
    void display()
    {
    System.out.println("Multiplication: "+mul);
    }
}
class Div extends Add
{
    float div;
    Div()
    {
        System.out.print("Enter two integers for Division: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        div=a/b;
    }
    void display()
    {
    System.out.println("Division: "+div);
    }
}
class hierarchical_inheritance
{
    public static void main(String args[])
    {
        Add a=new Add();
        a.display();
        System.out.println("*******************************************");
        Sub s=new Sub();
        s.display();
        System.out.println("*******************************************");
        Mul m =new Mul();
        m.display();
        System.out.println("*******************************************");
        Div d=new Div();
        d.display();
        System.out.println("*******************************************");
    }
}