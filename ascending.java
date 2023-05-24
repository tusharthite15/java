import java.util.*;
class ascending 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int i;
        int array[] = new int[n];
        System.out.print("Enter the numbers: ");
        for(i=0;i<n;i++)
        {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Sorted Array: ");
        for(i=0;i<n;i++)
        {
            System.out.println(array[i]);
        }
    }
}
