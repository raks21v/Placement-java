import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int x=1;
        // for(int i=1;i<=4;i++){
        // for(int j=1 ; j<=4;j++){
        // System.out.print(x + " ");
        // x++;
        // }
        // System.out.println();
        // }
        // for(int i=1;i<=4;i++){
        // for(int j=1 ; j<=4;j++){
        // System.out.print( "* ");
        // }
        // System.out.println();
        // }
        int r = sc.nextInt();
        //int c = sc.nextInt();
        // char ch = 'a';
        // for(int i=1;i<=r;i++){
        // for(int j=1 ; j<=c;j++){
        // System.out.print(ch + " ");
        // ch++;
        // }
        // System.out.println();
        // }
        // char ch = 'z';
        // for(int i=1;i<=r;i++){
        // for(int j=1 ; j<=c;j++){
        // System.out.print(ch + " ");
        // ch--;
        // }
        // System.out.println();
        // }
        // print cols
        // for(int i=1;i<=r;i++){
        // for(int j=1 ; j<=c;j++){
        // System.out.print(j+ " ");
        // }
        // System.out.println();
        // }
        // for(int i=1;i<=r;i++){
        // for(int j=1 ; j<=c;j++){
        // System.out.print(i+ " ");
        // }
        // System.out.println();
        // }
        // for(int i=1;i<=r;i++){
        // for(int j=1 ; j<=c;j++){
        // System.out.print(r-(i-1)+ " ");
        // }
        // System.out.println();
        // }
        // for(int i=0;i<=r;i++){
        // for(int j=1 ; j<=c;j++){
        // System.out.print(i+ " ");
        // }
        // System.out.println();
        // }
        // or
        // for(int i=1;i<=r;i++){
        // for(int j=1 ; j<=c;j++){
        // System.out.print(i-1+ " ");
        // }
        // System.out.println();
        // }
        // int x=1;
        // for(int i=1;i<=r;i++){
        // for(int j=1 ; j<=c;j++){
        // System.out.print(x + " ");
        // x+=2;
        // }
        // System.out.println();
        // }
        // for(int i=0;i<=r;i++){
        // for(int j=1 ; j<=i;j++){
        // System.out.print("*" );
        // }
        // System.out.println();
        // }
        // for(int i=0;i<=r;i++){
        // for(int j=1 ; j<=i;j++){
        // System.out.print(i+" " );
        // }
        // System.out.println();
        // }
        // char ch ='A';
        // for(int i=0;i<=r;i++){
        // for(int j=1 ; j<=i;j++){
        // System.out.print(ch++ + " ");
        // }
        // System.out.println();
        // }
        // for (int i = 1; i <= r; i++) {
        //     for (int j = 1; j <= r - i + 1; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // char ch = 'A';
        // for (int i = 1; i <= r; i++) {
        //     ch='A';
        //     for (int j = 1; j <= r - i + 1; j++) {
        //         System.out.print(ch  + " ");
        //         ch++;
        //     }
        //     System.out.println();
            
        // }
        // for (int i = 1; i <= r; i++) {
        //     for (int j = 1; j <= r - i + 1; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
            
        // }
        char ch = 'J';
        for (int i = r; i >= 1; i++) {
            //ch='G';
            for (int j = 1; j <= i - j + 1; j++) {
                System.out.print(ch  + " ");
                ch++;
            }
            System.out.println();
            
        }
        /*
         G H I J 
         D E F
         B C
         A
        */
        
        sc.close();
    }

}
