abstract class Animal {
    public abstract void makeSound();
    
    public void sleep() {
        System.out.println("Zzzz...");
    }

}
class Dog extends Animal{ 
    public void makeSound(){
        System.out.println("boo...");
}
}
class AbClass{
    
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.makeSound();
        d1.sleep();
}
}
