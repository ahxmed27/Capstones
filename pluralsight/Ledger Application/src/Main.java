import java.util.Scanner;

public class Main {

    public static Scanner console = new Scanner(System.in);
    public static void main(String[] args){
    boolean exit = false;
    while(!exit){
       exit = logic();
    }
    }

    private static boolean logic() {
        display();
        String menuChoice = console.nextLine();
        switch(menuChoice){
            case "D":
                Debit.addDeposit();
                break;

            case "P":
                Debit.addPayment();
                break;

            case "L":
                Ledger.display();
                String reportChoice = console.nextLine();
                switch(reportChoice){
                    case "A":
                        Ledger.entries();
                        break;
                    case "D":
                        Ledger.deposits();
                        break;
                    case "P":
                        Ledger.payments();
                        break;

                    //case "H":
                     //   logic();
                      //  break;
                    default:
                        System.out.println("Invalid option.");
                }
                break;
            case "X":
                System.out.println("THANKS FOR USING OUR LEDGER!!!!!");
                return true;

            default:
                System.out.println("Invalid option.");
        }

        return false;
    }

    private static void display() {
        System.out.println("|||||||||| WELCOME TO THE ACCOUNTING LEDGER||||||||||");
        System.out.println("PICK A OPTION");
        System.out.println("D) Add Deposit");
        System.out.println("P) Make Payment (Debit)");
        System.out.println("L) Ledger ");
        System.out.println("X) Exit");
        System.out.print("Answer: ");
    }
}
