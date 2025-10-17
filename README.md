# Accounting Ledger CLI Application

A Java-based **Command-Line Interface (CLI) application** to track financial transactions for personal or business use.  
This project was developed as part of the **Java Development Capstone 1**.  

The application allows users to add deposits and payments, view all transactions, filter by deposits/payments, and generate reports based on date or vendor.

---

## Features

### Home Screen
- `D` Add Deposit
- `P` Make Payment (Debit)
- `L` Ledger
- `X` Exit

### Ledger Screen
- `A` Display All Entries (newest first)
- `D` Display Deposits
- `P` Display Payments
- `R` Reports
- `H` Go back to Home

### Reports Menu
- Month To Date transactions
- Previous Month transactions
- Year To Date transactions
- Previous Year transactions
- Search by Vendor
- Back to Ledger

---

## Data Storage
All transactions are stored in a `transactions.csv` file in the following format:

# Example Screenshots
Screenshots of the application can be found in the `screenshots` folder.

## Interesting Code Snippet
## Interesting Code Snippets

One of the most challenging and interesting parts of my project was implementing the **menu and submenu system**. 

Using `while` loops, I ensured that users remain within a menu or submenu until they explicitly choose to exit. This design keeps the navigation intuitive and prevents users from accidentally leaving a screen without making a conscious choice.

Another interesting feature is in the **Ledger class**, where I handle user input for transactions. 

I split the input string to extract each part of a transaction, including the date. Then, I further split the date into **month, day, and year** to allow for precise filtering. 

This approach enables the creation of specific methods that let the user generate detailed reports and gain better insights from their transaction data.



