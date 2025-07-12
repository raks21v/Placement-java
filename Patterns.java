import java.util.Scanner;
import java.lang.Math;

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
        // char ch = 'A';
        // for (int j = i; j <= r; j++) {
        // System.out.print(ch + " ");
        // ch++;
        // }
        // System.out.println();
        // }
        // A B C D
        // A B C
        // A B
        // A
        // for (int i = r; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1
        // for(int i =r;i>=1;i--){
        // for(int j=1;j<=i;j++){
        // System.out.print( "* ");
        // }
        // System.out.println();
        // }
        // for(int i=r;i>=1;i--){
        // for(int j=1;j<=i;j++){
        // System.out.print(r+ " ");
        // }
        // System.out.println();
        // }
        // char ch = 'A';
        // for(int i=r;i>=1;i--){
        // for(int j=1;j<=i;j++){
        // System.out.print(ch + " ");
        // //ch++;
        // }
        // ch++;
        // // System.out.println();
        // }
        // for(int i =1;i<=r;i++){
        // for(int k=1;k<=r-i;k++){
        // System.out.print(" ");
        // }
        // for(int j =1;j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for(int i = 1; i<=r;i++){
        // for(int k=1;k<=r-i;k++){
        // System.out.print(" ");
        // }
        // for(int j=1;j<=i;j++){
        // System.out.print(j);
        // }
        // System.out.println();
        // }
        // for(int i= 1;i<=r;i++){
        // char ch = 'a';
        // for(int k=1;k<=r-i;k++){
        // System.out.print(" ");
        // }
        // for(int j=1;j<=i;j++){
        // System.out.print(ch);
        // ch++;
        // }
        // System.out.println();
        // }
        // for(int i=1;i<=r;i++){
        // for(int k=1;k<=r-i;k++){
        // System.out.print(" ");
        // }
        // for(int j =1;j<=i;j++){
        // System.out.print("*");
        // }
        // for(int j=1;j<=i-1;j++){//m
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for(int i=1;i<=r;i++){
        // for(int k=1;k<=r-i;k++){
        // System.out.print(" ");
        // }
        // for(int j =1;j<=i;j++){
        // System.out.print(j);
        // }
        // for(int j=i-1;j>=1;j--){//m
        // System.out.print(j);
        // }
        // System.out.println();
        // }
        // for(int i=r;i>=1;i--){
        // for(int k=1;k<=r-i;k++){
        // System.out.print(" ");
        // }
        // for(int j =1;j<=i;j++){
        // System.out.print(j);
        // }
        // for(int j=i-1;j>=1;j--){//m
        // System.out.print(j);
        // }
        // System.out.println();
        // }
        // for(int i=r;i>=1;i--){
        // for(int k=1;k<=r-i;k++){
        // System.out.print(" ");
        // }
        // for(int j =1;j<=i;j++){
        // System.out.print("*");
        // }
        // for(int j=i-1;j>=1;j--){//m
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // int r = sc.nextInt();
        // palindrome of a number
       
        // int val_n = n;
        // int rev=0,rem;
        // while(n>0){
        // rem = n%10;
        // n = n/10;
        // rev = rev * 10 + rem;
        // }
        // if(val_n == rev){
        // System.out.println("Palindrome");
        // }else{
        // System.out.println("Not a Palindrome");
        // }
        // int n_pos = Math.abs(n);
           int n = sc.nextInt();
        // int even_sum = 0;
        // int odd_sum = 0;
        // int rem;
        // while (n_pos > 0) {
        // rem = n_pos % 10;
        // if (rem % 2 == 0) {
        // even_sum += rem;
        // } else {
        // odd_sum += rem;
        // }
        // n_pos = n_pos / 10;
        // }
        // System.out.println(even_sum);
        // System.out.println(odd_sum);
        // perfect number
        // A perfect number is a positive integer that is equal to the sum of its proper
        // divisors,
        // excluding itself. For example, 6 is a perfect number because its divisors are
        // 1, 2, and 3,
        // int sum = 0;
        // for(int i = 1;i<=n-1;i++){
        // if(n%i == 0){
        // sum+=i;
        // }
        // }
        // if(sum == n){
        // System.out.println("Perfect Number");
        // }else{
        // System.out.println("Not a perfect number");
        // }
        // strong number
        // A strong number is a number whose sum of the factorials of its digits is
        // equal to the number itself.
        // int rem, fact = 1, sum = 0;
        // int m=n;
        // while (n != 0) {
        //     rem = n % 10;
        //     n = n / 10;
        //     fact = 1; // Reset factorial for each digit
        //     for (int i = 1; i <= rem; i++) {
        //         fact *= i;
        //     }
        //     sum += fact;
        // }
        // if (sum == m) {
        //     System.out.println("Strong Number");
        // } else {
        //     System.out.println("Not a Strong Number");
        // }
        //armstrong number 
        int sum =0,rem,pov=1;
        int m=n;
        int count =0;
        while(n>0){
            n=n/10;
            count++;
        }
        n = m;
        while(n>0){
            rem = n%10;
            n=n/10;
            pov = 1; // Reset power for each digit
            for(int j = 1;j<=count;j++){
                    pov *= rem;
            }
            // for(int i = 0;i<=rem;i++){
            //     pov = (int) Math.pow(rem,count);   
            // }
            sum +=pov;
        }
        System.out.println(sum);
        if(sum==m){
            System.out.println("armstrong number");
        }else{
            System.out.println("not armstrong");
        }
        //nearest divisible number
        // int m = sc.nextInt();
        
        // int near =0;
        // if(m%n == 0){
        //     near = m;
        // }else{
        //     int rem = m%n;
        //     if(rem <= n/2){
        //         near = m - rem;
        //     }else{
        //         near = m + (n - rem);
        //     }
        // }
        // if(m%n == 0){
        //     near = (m -1 )/n;
        // }
        // System.out.println("Nearest divisible number is: " + near);

        // sc.close();
    }

}
