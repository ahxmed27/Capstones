/**
 * The Ledger class provides methods to display and filter financial transactions.
 * It allows viewing all entries, filtering by deposits or payments,
 * and generating date or vendor-based reports.
 */
public class Ledger {


    public static void display() {
        System.out.println("A) All - Display all entries");
        System.out.println("D) Deposits");
        System.out.println("P) Payments");
        System.out.println("R) Reports");
        System.out.println("H) Home - Go back to the Home page");
        System.out.print("Answer: ");
    }

    public static void entries() {
        for (int i = Debit.list.size() - 1; i >= 0; i--) {
            System.out.println(Debit.list.get(i).toString());
        }
    }

    public static void deposits() {
        boolean deposit = false;
        for (int i = Debit.list.size() - 1; i >= 0; i--) {
            if (Debit.list.get(i).getAmount() > 0) {
                System.out.println(Debit.list.get(i).toString());
                deposit = true;
            }
        }
        if (!deposit) {
            System.out.println("No deposit records found.");
        }
    }

    public static void payments() {
        boolean payment = false;
        for (int i = Debit.list.size() - 1; i >= 0; i--) {
            if (Debit.list.get(i).getAmount() < 0) {
                System.out.println(Debit.list.get(i).toString());
                payment = true;
            }
        }
        if (!payment)
            System.out.println("No Payment records found.");
    }

    public static void reportsDisplay() {
        System.out.println("1) Month To Date transactions");
        System.out.println("2) Previous Month transactions");
        System.out.println("3) Year To Date transactions");
        System.out.println("4) Previous Year transactions");
        System.out.println("5) Search by Vendor");
        System.out.println("0) Back - Go back to the Ledger page");
        System.out.print("Answer: ");

    }

    public static void monthDate() {
        String[] split;
        boolean check = false;
        for (Transaction x : Debit.list) {
            split = x.getDate().split("-");
            if (Integer.parseInt(split[0]) == 2025 && Integer.parseInt(split[1]) == 10) {
                System.out.println(x.toString());
                check = true;
            }
        }
        if (!check) {
            System.out.println("No transaction records found.");
            check = true;
        }

    }

    public static void previousMonth() {
        String[] split;
        boolean check = false;
        for (Transaction x : Debit.list) {
            split = x.getDate().split("-");
            if (Integer.parseInt(split[0]) == 2025 && Integer.parseInt(split[1]) == 9) {
                System.out.println(x.toString());
                check = true;
            }
        }
        if (!check) {
            System.out.println("No transaction records found.");
            check = true;
        }
    }

    public static void YearDate() {
        String[] split;
        boolean check = false;
        for (Transaction x : Debit.list) {
            split = x.getDate().split("-");
            if (Integer.parseInt(split[0]) == 2025) {
                System.out.println(x.toString());
                check = true;
            }
        }
        if (!check) {
            System.out.println("No transaction records found.");
            check = true;
        }
    }

    public static void previousYear() {
        String[] split;
        boolean check = false;
        for (Transaction x : Debit.list) {
            split = x.getDate().split("-");
            if (Integer.parseInt(split[0]) == 2024) {
                System.out.println(x.toString());
                check = true;
            }
        }
        if (!check) {
            System.out.println("No transaction records found.");
            check = true;
        }
    }

    public static void searchByVendor(String next) {
        boolean check = false;
        for (Transaction x : Debit.list) {
            if (x.getVendor().equalsIgnoreCase(next)) {
                System.out.println(x.toString());
                check = true;
            }
        }
        if (!check) {
            System.out.println("No vendor match found.");
            check = true;
        }
    }
}
