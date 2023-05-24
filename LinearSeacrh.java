import java.util.Scanner;

class LinearSearch{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int i;
        int arr[]=new int [n];
        System.out.println("Enter the elements8 of array: ");
        for(int j=0;j<n;j++){
            arr[j]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int found=sc.nextInt();
        
        for( i=0;i<n;i++){
            if(arr[i]==found){
                System.out.println("Element is found at "+i);
                break;
            }
        }
        if(i==n){
            System.out.println("Element is not found");
        }
    }
}