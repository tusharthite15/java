import java.util.Scanner;
class AreaFind {
    private int length;
    private int breadth;
    public void setDim(int len, int bre) {
        length = len;
        breadth = bre;
    }

    public int getArea() {
        return length * breadth;
    }
}
public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        int breadth = sc.nextInt();

        AreaFind a = new AreaFind();
        a.setDim(length, breadth);
        System.out.println("Area of rectangle is: " + a.getArea());
    }
}
