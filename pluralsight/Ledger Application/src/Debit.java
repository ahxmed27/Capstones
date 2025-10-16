import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Debit {

    public static ArrayList<Transaction> list = new ArrayList<>();

    public static Scanner console = new Scanner(System.in);

    Debit(){
    }
    public static void addDeposit(){
        try{
            FileWriter writer = new FileWriter("transactions.csv", true);
            BufferedWriter buffer = new BufferedWriter(writer);
            System.out.println("Enter your deposit information in the format: " +
                    "date|time|description|vendor|amount (use a positive value for the amount)");
            String [] split = console.nextLine().split("\\|");
            Transaction transaction = new Transaction(split[0], split[1], split[2], split[3], Double.parseDouble(split[4]));
            list.add(transaction);
            writer.write(transaction.toString() + "\n");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void addPayment(){
        try{
            FileWriter writer = new FileWriter("transactions.csv", true);
            BufferedWriter buffer = new BufferedWriter(writer);
            System.out.println("Enter your payment information in the format: " +
                    "date|time|description|vendor|amount (use a negative value for the amount)");
            String [] split = console.nextLine().split("\\|");
            Transaction transaction = new Transaction(split[0], split[1], split[2], split[3], Double.parseDouble(split[4]));
            list.add(transaction);
            writer.write(transaction.toString() + "\n");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
