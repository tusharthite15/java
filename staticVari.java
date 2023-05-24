public class staticVari {
    static int count; 
    // static variable

    static { 
        // static block
        System.out.println("Static block executed.");
        count = 0;
    }

    public static void increCount() { 
        // static method
        count++;
    }

    public static void main(String[] args) {
        staticVari.increCount();
        staticVari.increCount();
        System.out.println("Count: " + staticVari.count);
    }
}
