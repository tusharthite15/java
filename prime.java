import java.util.Scanner;
class prime 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n, i, count=0;
        System.out.print("Enter Number: ");
        n = sc.nextInt();
        for(i=2;i<n;i++)
        {
            if(n%i==0)
                count++;
        }
        if(count >= 1)
            System.out.println(n + " is not the prime number");
        else
            System.out.println(n + " is the prime number");
    }
}
