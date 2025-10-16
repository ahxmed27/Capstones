import javax.crypto.spec.PSource;

public class Ledger {


    public static void display(){
        System.out.println("A) All - Display all entries");
        System.out.println("D) Deposits");
        System.out.println("P) Payments");
        System.out.println("R) Reports");
        System.out.print("Answer: ");
    }
    public static void entries(){
        for(Transaction x: Debit.list){
            System.out.println(x.toString());
        }
    }

    public static void deposits(){
        boolean deposit = false;
        int count = 0;
        for(Transaction x: Debit.list){
            if(x.getAmount() > 0){
                System.out.println(x.toString());
                deposit = true;
                count++;
            }
            else if(!deposit && count == 0 ){
                System.out.println("No deposit records found.");
                count++;
            }
        }
    }

    public static void payments(){
        boolean payment = false;
        int count = 0;
        for(Transaction x: Debit.list){
            if(x.getAmount() < 0){
                System.out.println(x.toString());
                payment = true;
                count++;
            }
            else if(!payment && count == 0)
                System.out.println("No Payment records found.");
            count++;
            }
        }
    }
