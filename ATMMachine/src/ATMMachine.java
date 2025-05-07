import java.util.Scanner;

class ATM {

    float Balance;
    int Pin = 5555;

    ATM(){
        System.out.println("Enter your ATM Pin:-");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();

        if (enteredPin == Pin) {
            menu();
        } else {
            System.out.println("Invalid Pin");
            System.out.println("====================================================");
            System.out.println("Enter A valid pin-:");
            menu();

        }
    }
    /*public void checkpin() {

        System.out.println("Enter your ATM Pin:-");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();

        if (enteredPin == Pin) {
            menu();
        } else {
            System.out.println("Invalid Pin");
            System.out.println("====================================================");
            System.out.println("Enter A valid pin-:");
            menu();

        }
    }*/

    public void menu() {
        System.out.println("Enter a valid choice:");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdrawal Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if (opt == 1) {
            checkAccountBalance();

        } else if (opt == 2) {
            withdrawalMoney();

        } else if (opt == 3) {
            depositMoney();

        } else if (opt == 4) {
            System.out.println("Thank you for using ICICI Bank ATM!!!");
            return;

        } else {
            System.out.println("Enter the valid Choice:");
            menu();
        }

    }

    public void checkAccountBalance() {
        System.out.println("Balance :" + Balance);
        menu();
    }

    public void withdrawalMoney() {

        System.out.println("Enter withdrwal Amount:");

        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        if (amount > Balance) {
            System.out.println("Insufficent Funds");
        } else {
            Balance = Balance - amount;
            System.out.println("Money Withdrwal sucessfully");
        }
        menu();

    }

    public void depositMoney() {
        System.out.println("Enter The Amount:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;

        System.out.println("Money Deposit sucessfully");
        menu();
    }
}


public class ATMMachine {
    public static void main(String[] args) {

        ATM atm = new ATM();
       // atm.checkpin();

    }

}