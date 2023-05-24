import java.util.Scanner;

public class bubble {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else{
                    continue;
                }
            }
        }
        System.out.println("Sorted Array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

