public class A {
    public static void main(String[] args) {
        //System.out.println("main starts");
        System.out.println(area(5,true));
        System.out.println(area(5,false));
        System.out.println(area(2,3,true));
        System.out.println(area(3,4,false));
        //System.out.println("main ends");

    }

    // polymorphism - same method name with different parameters
    // overloading - same method name with different parameters,argument types, or
    // number of parameters
    // public static void m1(){
    // System.out.println("m1() starts");
    // System.out.println("m1() ends");
    // }
    // public static void m1(int a){
    // System.out.println("m1(int a) starts");
    // System.out.println("m1(int a) ends");
    // }
    // public static int add(){
    // return 0;
    // }
    // public static int add(int a){
    // return a;
    // }
    // public static int add(int a, int b){
    // return a + b;
    // }
    // public static int add(int a,int b,int c){
    // return a + b + c;
    // }
    /*
     * area(int noolean)
     * t--are
     * f-circle
     * area(int int boolean)
     * t--rect
     * f-triangle
     */
    public static double area(int r ,boolean val){
       return (val) ? 3.14*r*r : r*r;

    }

    public static double area(int h,int b,boolean val){
        return (val) ? h*b : 0.5*h*b;

    }
}