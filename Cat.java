public class Cat {
    int h,w;
    String c;
    void eat() {
        System.out.println("Cat is eats");
    }
    void run() {
        System.out.println("Cat is runs");
    }
    void sleep() {
        System.out.println("Cat is sleeps");
    }
    void meow() {//static void meow
        System.out.println("Cat is meows");
    }
    Cat(){
        super();
        //this -- current class object
        this.h=5;
        this.w=3;
        this.c="Black";
    }
    Cat(int h,int w,String c){//parameterized constructor
        super();
        this.h=h;
        this.w=w;
        this.c=c;
    }
    void update_color(String color) {
        this.c=color;
    }
    void update_height(int height) {
        this.h=h+height;
    }
    void update_weight(int weight) {
        this.w=w+weight;
    }
    void display() {
        System.out.println("Height: "+this.h);
        System.out.println("Weight: "+this.w);
        System.out.println("Color: "+this.c);
    }
    public static void main(String args[]){
        Cat c1=new Cat();
        c1.run();
        c1.eat();
        // c1.sleep();
        // c1.run();
        //we cannot refer non static method in static context
        //why because static methods are class level methods
        //and non static methods are object level methods 
        // by making static we can refer it without creating an object
        //meow();
        // System.out.println(c1.h);
        // System.out.println(c1.w);
        // System.out.println(c1.c);
        //initialized values are default values
        //int - 0
        //float - 0.0   
        //double - 0.0
        //boolean - false
        //char - \u0000
        //String - null
        //object - null
        //jvm will allocate memory for the object
        //and it will initialize the values with default values
        //we can access the variables using object reference
        //contructor is used to initialize the state object -- same name as class name--special method--no return type and no static keyword
        //default constructor is used to initialize the object with default values
        //parameterized constructor is used to initialize the object with user defined values
        //c1.display();
        // c1.update_color("White");
        // c1.update_height(10);
        // c1.update_weight(7);
        //c1.display();
        /*
         * 3 real world instance
         * state
         * object 
         * method
         * ->mobile phone-l , b
         * -> state - brand,model,color,price
         * -> object - samsung,apple,oneplus
         * -> method - call, message, camera, music -- increar vol by 2 points,braightness by 5 points
         * dog
         * student--marks read from user
         * state - name,rollno,marks
         * object - rakshitha,priya,pranav
         * method - study,play,read,write
         */
        Cat c2=new Cat(20,20,"Golden brown");
        c2.display();

    }

    
}
