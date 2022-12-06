import java.util.Scanner;
class myBankAcc{
    String name, address, accType;
    double accBal;
    int accNum;
    static int count=0;

    //constructor to read
    myBankAcc(){
        Scanner sc=new Scanner(System.in);
        System.out.println("***** Enter the bank details *****");
        System.out.println("Enter Your Name:");
        name=sc.nextLine();
        System.out.println("Enter Your address:");
        address=sc.nextLine();
        System.out.println("Enter Your Account type:");
        accType=sc.nextLine();
        System.out.println("Enter Your Account Balance:");
        accBal=sc.nextDouble();
        accNum=++count;
    }

    //Constructor to initialise
    myBankAcc(String name, String address, String accType, double accBal){
        this.name=name;
        this.address=address;
        this.accType=accType;
        this.accBal=accBal;
        accNum=++count;
    }

    //compute interest
    void computeInterest(int time){
        double interest=0;
        if("sb".equals(accType)) {
            interest = accBal * time * 0.05;
            System.out.println("Interest on sb is: " + interest);
        }
            else if("rd".equals(accType)) {
            interest = accBal * time * 0.065;
            System.out.println("Interest on rd is: " + interest);
        }
            else if("fd".equals(accType)) {
            interest = accBal * time * 0.0765;
            System.out.println("Interest on fd is: "+interest);
        }
        else{
            System.out.println("Invalid account!!");
        }

    }
    void withdraw(double amt) {
        if ((accBal - amt) < 1000)
            System.out.println("Insufficient funds");
        else {
            accBal -= amt;
            System.out.println("Balance is: " + accBal);
        }
    }
        void deposit ( double amt){
            accBal += amt;
            System.out.println("Balance is: " + accBal);
        }


}
public class Main {
    public static void main(String[] args) {

        myBankAcc ba1=new myBankAcc(); //read details using constructor
        ba1.computeInterest(2);
        ba1.withdraw(1000);
        ba1.deposit(2000);

        myBankAcc ba2=new myBankAcc("GIT","Udyambagh","fd",2000.0); //details
        ba2.computeInterest(1);
        ba2.withdraw(500);
        ba2.deposit(1000);

    }
}