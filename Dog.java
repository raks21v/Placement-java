public class Dog {
    int h,w;
    String name;
    void bark() {
        System.out.println("Dog is barking");
    }
    void run() {
        System.out.println("Dog is running");
    }
    void sleep() {
        System.out.println("Dog is sleeping");
    }
    void wagTail() {
        System.out.println("Dog is wagging its tail");
    }
    Dog() {
        super();
        this.h = 10;
        this.w = 20;
        this.name = "Buddy";
    }
    Dog(int h, int w, String name) {
        super();
        this.h = h;
        this.w = w;
        this.name = name;
    }
    void display() {
        System.out.println("Height: " + this.h);
        System.out.println("Weight: " + this.w);
        System.out.println("Name: " + this.name);
    }
    public static void main(String args[]) {
        Dog d1 = new Dog();
        d1.bark();
        d1.run();
        d1.sleep();
        d1.wagTail();
        d1.display();
    }    
    
}
