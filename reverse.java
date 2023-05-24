import java.util.Scanner;
class reverse
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int rem, temp=0;
        while(num>0)
        {
            rem = num % 10;
            temp = temp*10+rem;
            num/=10;
        }
        System.out.println("Reverse Number: "+ temp);
    }
}