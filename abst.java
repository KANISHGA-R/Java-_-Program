import java.util.Scanner;

class abst{
    public static void main(String[] args) {
        int pin_no  = 2008;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your pin: ");
        int pin = sc.nextInt();
        sample o = new sample();
        if(pin_no == pin){
            System.out.println("1.Check Balance\n2. Deposit\n3.Withdraw\n4.Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            if (choice == 1){
                System.out.println(o.getBalance());
            }
            else if (choice == 2) {
                System.out.println("Enter your amount: ");
                double amt = sc.nextDouble();
                o.deposit(amt);
                System.out.println("Your amount has been deposited successfully!");
                System.out.println("New balance is: " + o.getBalance());
            
            }
            else if(choice == 3){
                System.out.println("Enter amount:  ");
                double amt = sc.nextDouble();
                o.withdraw(amt);
                System.out.println("Your amount has been withdrawn successfully!");
            }
            else if (choice == 4) {
                System.out.println("Thank you!");
            }
            else{
                System.out.println("Invalid choice!");
            }
        }
        else{
            System.out.println("Incorrect pin!");
        }
    }
}

class sample{
    private double balance = 4000.80;

    double getBalance(){
        return balance;
    }

    void deposit(double amount){
        balance += amount;
    }

    void withdraw(double amount){
        balance -= amount;
    }
}