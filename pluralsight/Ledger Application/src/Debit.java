/**
 * The Debit class manages deposits and payments for a financial ledger.
 * It allows users to add transactions (deposits or payments) and
 * stores them both in memory and in a CSV file.
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Debit {

    public static ArrayList<Transaction> list = new ArrayList<>();

    public static Scanner console = new Scanner(System.in);

    Debit(){
    }

    public static void load(){
        try{
            FileReader file = new FileReader("transactions.csv");
            BufferedReader buffer = new BufferedReader(file);
            String[] split;
            String input;
            while ((input = buffer.readLine()) != null) {
                split = input.split("\\|");
                Transaction transaction = new Transaction( split[0],
                        split[1], split[2], split[3], Double.parseDouble(split[4]) );
                list.add(transaction);
            }
            buffer.close();
        }
        catch (Exception e) {
            System.out.println("Error reading file");
        }
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
        } catch (Exception e) {
            System.out.println("Invalid input Try again");
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
        } catch (Exception e) {
            System.out.println("Invalid input. Try again");
        }

    }

    public static boolean isEmpty() {
        return list.isEmpty();
    }
}
