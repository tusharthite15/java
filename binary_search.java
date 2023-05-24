import java.util.Scanner;
class binary_search 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i, search, low, high, mid;
        System.out.print("Enter Numbers: ");
        for(i=0;i<n;i++)
            arr[i] = sc.nextInt();
        low = 0;
        high = n - 1;
        mid = (low + high) / 2;
        System.out.print("Enter number to search: ");
        search = sc.nextInt();
        while(low <= high)
        {
            if(arr[mid] < search)
                low = mid + 1;
            else 
            {
                if (arr[mid] == search)
                {
                    System.out.println("Element Found");
                    break;
                }
                else
                    high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        if(low > high)
            System.out.println("Element Not Found");
    }
}
