import java.util.Scanner;
public class Operations {
    public static void main(String[] args) {
        // int a = 10 , b = 20;
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int add = a+b;
        // int sub = a-b;
        // int mult = a*b;
        // int div = a/b;
        // int mod = a%b;
        // System.out.println(add);
        // System.out.println(sub);
        // System.out.println(mult);
        // System.out.println(div);
        // System.out.println(mod);
        // boolean result = a>b;
        // System.out.println(result);
        // result = a<b;
        // System.out.println(result);
        // result = a>=b;
        // System.out.println(result);
        // result = a<=b;
        // System.out.println(result);
        // int h1 = sc.nextInt();
        // int h2 = sc.nextInt();
        // if(h1==h2){
        //     System.out.println("0");
        // }else{
        //     System.out.println("1");
        // }
        // boolean result = (h1==h2);
        // System.out.println("0");
        // result = (h1!=h2);
        // System.out.println("1");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // float result = (float)a/b;
        // System.out.println( result);
        // int N = sc.nextInt();
        // int M = sc.nextInt();
        // int total = (N * 5) + (M * 7);
        // System.out.println(total);
        // int inch = sc.nextInt();
        // float cm = inch * 2.54f;
        // System.out.print(cm);
        // int kmph = sc.nextInt();
        // float mps = (float)kmph * 5 / 18;
        // System.out.println(mps);
        int a = sc.nextInt();
        int area = a * a;
        int perimeter = 4 * a;
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        
        sc.close();
    }
}
