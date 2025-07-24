import java.util.Scanner;
public class ATM {
    String name;
    long mobile_number;
    double balance;
    void create_account() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = sc.nextLine();
        System.out.println("Enter your mobile number:");
        mobile_number = sc.nextLong();
        System.out.println("Enter your initial balance:");
        balance = sc.nextDouble();
        if(balance <10000){
            System.out.println("Minimum balance should be 10000. Please try again.");
            balance = 0; 
        } else {
            System.out.println("Account created successfully!");

        }  
        System.out.println("current balence: " + balance);
    }
    void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("new balance after deposit: " + balance);
        }else{
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
        System.out.println("current balance: " + balance);

    }
    void withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient balance.");
        } else if(amount <= 0){
            System.out.println("Invalid withdrawal amount.");
        } else {
            balance -= amount;
            System.out.println("new balance after withdrawal: " + balance);
        }
        System.out.println("curent balance: " + balance);
    }
    void transfer(double amount , String recipientName) {
        if(amount > balance){
            System.out.println("Insufficient balance for transfer.");
        } else if(amount <= 0){
            System.out.println("Invalid transfer amount.");
        } else {
            balance -= amount;
            System.out.println("Transferred " + amount + " to " + recipientName + ". New balance: " + balance);
        }
        System.out.println("current balence: " + balance);
    }
    public static void main(String[] args){
        ATM a1 = new ATM();
        a1.create_account();
        a1.deposit(10000);

    }
    
}
