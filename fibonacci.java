import java.util.*;;
public class fibonacci {
    public static int fib(int a) {
        if(a==0||a==1) return a;

        return fib(a-1)+fib(a-2);
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    System.out.println(fib(a));
}
}
