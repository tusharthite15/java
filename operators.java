class operators {
    public static void main(String[] args) 
    {
        int a = 10, b = 40, c;

        c = ++a; //unary
        System.out.println(c);
        System.out.println(a + b); // arithmetic
        a+=5; //  assignment
        System.out.println(a);
        System.out.println(a==c && a<b); // logical
        System.out.println(a!=b | b==c); // bitwise
        System.out.println(10<<2);//10*2^2=10*4=40 left shift
        System.out.println(10>>2);//10/2^2=10/4=2  right shift
       
    }
}
