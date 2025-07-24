public class Mobile {
    int length, width,braightness, volume;

    Mobile() {
        super();
        this.length = 15;
        this.width = 7;
        this.braightness = 60;
        this.volume = 50;
    }
    void braightness() {
        System.out.println("Mobile brightness is adjusted");
    }
    void increase_braightness() {
        this.braightness += 20;
        System.out.println("Brightness increased to: " + this.braightness);
    }
    void decrease_braightness() {
        this.braightness -= 20;
        System.out.println("Brightness decreased to: " + this.braightness);
    }
    void increase_volume() {
        this.volume += 10;
        System.out.println("Volume increased to: " + this.volume);
    }
    void decrease_volume() {
        this.volume -= 10;
        System.out.println("Volume decreased to: " + this.volume);
    }
    void display() {
        System.out.println("Length: " + this.length);
        System.out.println("Width: " + this.width);
        System.out.println("Brightness: " + this.braightness);
        System.out.println("Volume: " + this.volume);
    }
    public static void main(String args[]) {
        Mobile m1 = new Mobile();
        m1.decrease_braightness();
        m1.decrease_volume();
        m1.display();
        m1.braightness();
        m1.increase_braightness();
        m1.increase_volume();
        m1.display();
    }
    
}
