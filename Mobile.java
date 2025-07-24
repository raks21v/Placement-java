public class Mobile {
    int length, width, braightness, volume;

    Mobile() {
        super();
        //this -- variable refers to the current class object
        //super() -- refers to the parent class object
        //super() is used to call the parent class constructor
        //this referes to the state of the object & 
        this.length = 15;
        this.width = 7;
        this.braightness = 60;
        this.volume = 50;
    }

    Mobile(int l, int w, int b, int v) {
        super();
        this.length = l;
        this.width = w;
        this.braightness = b;
        this.volume = v;
    }

    void braightness() {
        System.out.println("Mobile brightness is adjusted");
    }

    void increase_braightness(int b) {
        if(b<0 && b > 100) {
            this.braightness += b;
        }
        
    }

    void decrease_braightness(int b) {
        if(b<0 && b > 100) {
            this.braightness -= b;
        }
    }

    void increase_volume(int v) {
        if(v<0 && v > 100) {
            this.volume += v;
        }
    }

    void decrease_volume(int v) {
        if(v<0 && v > 100) {
             this.volume -= v;
        }
    }

    void display() {
        System.out.println("Length: " + this.length);
        System.out.println("Width: " + this.width);
        System.out.println("Brightness: " + this.braightness);
        System.out.println("Volume: " + this.volume);
        //System.out.printf("Length: %d, Width: %d, Brightness: %d, Volume: %d%n", this.length, this.width, this.braightness, this.volume);
    
    }

    public static void main(String args[]) {
        Mobile m1 = new Mobile();
        m1.increase_braightness(10);
        m1.decrease_volume(5);
        m1.display();
        Mobile m2 = new Mobile(20, 10, 80, 70);
        m2.increase_braightness(15);
        m2.decrease_volume(10);
        m2.display();
    }
}
