import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // if(age>=18){
        // System.out.println("Eligible for voting");
        // }else{
        // System.out.println("Not eligible for Voting");

        // }
        // System.out.println("In India");

        /*
         * assessment qn
         * int x = sc.nextInt();
         * int y = sc.nextInt();
         * int req = y/x;
         * if(y%x!=0){
         * req+=1;
         * }
         * System.out.println(req);
         */

        // int Marks = sc.nextInt();
        // if(Marks >= 70){
        // System.out.println("FCD");
        // }else if(Marks >= 60){
        // System.out.println("First Class");
        // }else if(Marks>=50){
        // System.out.println("SC");
        // }else if(Marks>=40){
        // System.out.println("Pass");
        // }else{
        // System.out.println("Fail");
        // }
        // ticket price
        // int age = sc.nextInt();
        // if(age <= 5){
        // System.out.println("Free for Children");
        // }else if(age <= 17){
        // System.out.println("10$ for Children");
        // }else if(age <= 59){
        // System.out.println("20$ for Adults");
        // }else{
        // System.out.println("15$ for Senior Citizens");
        // }
        // shopping discount
        // int amount_spent = sc.nextInt();
        // int discount ;
        // if(amount_spent >=100 && amount_spent < 500){
        // System.out.println("Discount is 10%");
        // discount = amount_spent * 10 / 100;//0.1
        // System.out.println(discount);
        // }else if(amount_spent >=500){
        // System.out.println("Discount is 20%");
        // discount = amount_spent * 20 / 100;//0.2
        // System.out.println(discount);
        // }else{
        // System.out.println("No Discount");
        // discount = 0;
        // }
        // System.out.println(amount_spent-discount);
        // ATM withdrawal
        // int balance = sc.nextInt();
        // int withdraw = sc.nextInt();
        // if(withdraw % 100 != 0){
        // System.out.println("Please enter amount in multiples of 100");
        // }else if(withdraw > balance){
        // System.out.println("Insufficient Balance");
        // }else{
        // balance -= withdraw;
        // System.out.println("Collect your Cash. Remaining Balance: " + balance);
        // }
        // employee bonus
        // int year = sc.nextInt();
        // int salary = sc.nextInt();
        // int bonus ;
        // if(year > 5){
        // bonus = salary * 10 / 100;
        // }else if(year >= 3){
        // bonus = salary * 5 / 100;
        // }else{
        // bonus = 0;
        // }
        // System.out.println(salary + bonus);

        // Equilateral,isosceles, or scalene
        // int s1=sc.nextInt();
        // int s2=sc.nextInt();
        // int s3=sc.nextInt();
        // if(s1 == s2 && s1 == s3){
        // System.out.println("Equilateral");
        // }else if(s1 == s2 || s1 == s3 ){
        // System.out.println("isoscele");
        // }else{
        // System.out.println("scalene");
        // }
        // char ovel or consonent
        // String ch = sc.next();
        // int v=0;
        // int c=0;
        // for(int i = 0 ; i<ch.length();i++){
        // switch (ch.charAt(i)) {
        // case 'a':
        // case 'A':
        // case 'e':
        // case 'E':
        // case 'i':
        // case 'I':
        // case 'o':
        // case 'O':
        // case 'u':
        // case 'U':v++;
        // break;
        // default:c++;
        // break;
        // }
        // }
        // System.out.println(v+" "+c);
        // arthematic operation
        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();
        // int res;
        // char op = sc.next().charAt(0);
        // switch (op) {
        //     case '+':
        //         res = n1 + n2;
        //         System.out.println(res);
        //         break;
        //     case '-':
        //         res = n1 - n2;
        //         System.out.println(res);
        //         break;
        //     case '/':
        //         if (n2 != 0) {
        //             res = n1 / n2;
        //             System.out.println(res);
        //         }
        //         break;
        //     case '%':
        //         res = n1 % n2;
        //         System.out.println(res);
        //         break;
        //     default:
        //         System.out.println("invalid operator");
        // }
    // count vowel and consonent
        String str = "Rakshitha";
        int v_count = 0;
        int c_count = 0;
        for(int i = 0 ; i <str.length() ; i++){
            char ch = str.charAt(i);
            if((ch>='A' && ch<='Z') || (ch>='a' && ch <= 'z')){
                if(ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u'){
                    v_count++;
                }else{
                    c_count++;
                }
            }

        }
        System.out.println(v_count+" "+c_count);

        sc.close();
    }
}