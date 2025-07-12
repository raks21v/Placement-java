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
        // int c = sc.nextInt();
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
        // for (int j = 1; j <= r - i + 1; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        // char ch = 'A';
        // for (int i = 1; i <= r; i++) {
        // ch='A';
        // for (int j = 1; j <= r - i + 1; j++) {
        // System.out.print(ch + " ");
        // ch++;
        // }
        // System.out.println();

        // }
        // for (int i = 1; i <= r; i++) {
        // for (int j = 1; j <= r - i + 1; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();

        // }
       
        // char ch = 'J';
        // for (int i = r; i >= 1; i--) {
        // //ch='G';
        // for (int j = 1; j <= i - j + 1; j++) {
        // System.out.print(ch + " ");
        // ch--;
        // }
        // System.out.println();

        // }
        /*
         * G H I J
         * D E F
         * B C
         * A
         */
        // for(int i = r;i>=1;i--){
        // char ch =(char) ('A'+ i-1);
        // for(int j=1;j<=i;j++){
        // System.out.print(ch+" ");
        // ch--;

        // }
        // System.out.println();
        // }
        // G F E D C B A
        // F E D C B A
        // E D C B A
        // D C B A
        // C B A
        // B A
        // A
        // for (int i = r; i >= 1; i--) {
        // for (int j = i; j >= 1; j--) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }
        // for (int i = r; i >= 1; i--) {
        // char ch = (char) ('A' + i-1 );
        // for (int j = 1; j <= i; j++) {
        // System.out.print(ch + " ");
        // ch+=1;

        // }
        // System.out.println();
        // }
        // for (int i = 1; i <= r; i++) {
        //     char ch = 'A';
        //     for (int j = i; j <= r; j++) {
        //         System.out.print(ch + " ");
        //         ch++;
        //     }
        //     System.out.println();
        // }
        // A B C D
        // A B C
        // A B
        // A
        // for (int i = r; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1
        // for(int i =r;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print( "* ");
        //     }
        //     System.out.println();
        // }
        // for(int i=r;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(r+ " ");
        //     }
        //     System.out.println();
        // }
        // char ch = 'A';
        // for(int i=r;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(ch + " ");
        //         //ch++;
        //     }
        //     ch++;
        // //     System.out.println();
        // }
        // for(int i =1;i<=r;i++){
        //     for(int k=1;k<=r-i;k++){
        //         System.out.print(" ");
        //     }
        //     for(int j =1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i = 1; i<=r;i++){
        //     for(int k=1;k<=r-i;k++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        // for(int i= 1;i<=r;i++){
        //     char ch = 'a';
        //     for(int k=1;k<=r-i;k++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }
        // for(int i=1;i<=r;i++){
        //      for(int k=1;k<=r-i;k++){
        //         System.out.print(" ");
        //     }
        //     for(int j =1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     for(int j=1;j<=i-1;j++){//m
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i=1;i<=r;i++){
        //      for(int k=1;k<=r-i;k++){
        //         System.out.print(" ");
        //     }
        //     for(int j =1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     for(int j=i-1;j>=1;j--){//m
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        // for(int i=r;i>=1;i--){
        //      for(int k=1;k<=r-i;k++){
        //         System.out.print(" ");
        //     }
        //     for(int j =1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     for(int j=i-1;j>=1;j--){//m
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        // for(int i=r;i>=1;i--){
        //      for(int k=1;k<=r-i;k++){
        //         System.out.print(" ");
        //     }
        //     for(int j =1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     for(int j=i-1;j>=1;j--){//m
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
         //int r = sc.nextInt();
        // palindrome of a number
        int n =sc.nextInt();
        int val_n = n;
        int rev=0,rem;
        while(n>0){
            rem = n%10;
            n = n/10;
            rev = rev * 10 + rem;
        }
        if(val_n == rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }


        sc.close();
    }

}
