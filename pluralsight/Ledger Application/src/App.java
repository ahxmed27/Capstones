import java.util.Scanner;

public class App {

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
                boolean exit = false;
                while(!exit){
                    exit = ledger();
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

    private static boolean ledger() {
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
            case "R":
                Ledger.reportsDisplay();
                String ledgerChoice = console.nextLine();
                if(Integer.parseInt(ledgerChoice.trim()) == 1){
                    Ledger.monthDate();
                }
                else if(Integer.parseInt(ledgerChoice.trim()) == 2){
                    Ledger.previousMonth();
                }
                else if(Integer.parseInt(ledgerChoice.trim()) == 3){
                    Ledger.YearDate();
                }
                else if(Integer.parseInt(ledgerChoice.trim()) == 4){
                    Ledger.previousYear();
                }
                else if(Integer.parseInt(ledgerChoice.trim()) == 5){
                    System.out.println("Enter the name of the vendor: ");
                    Ledger.searchByVendor(console.nextLine());
                }
                else if(Integer.parseInt(ledgerChoice.trim()) == 0){
                    System.out.println("Going back to the Ledger page");
                    return false;
                }
                else{
                    System.out.println("Invalid option.");
                }
                break;
            case "H":
                System.out.println("Going back to Home page");
                break;
            default:
                System.out.println("Invalid option.");
        }
        return true;
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
