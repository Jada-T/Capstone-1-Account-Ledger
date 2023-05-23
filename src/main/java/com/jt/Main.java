package com.jt;

public class Main {

    public class Transaction {
        private String date;
        private String time;
        private String description;
        private String vendor;
        private double amount;

        // constructor
        public Transaction(String date, String time, String description, String vendor, double amount) {
            this.date = date;
            this.time = time;
            this.description = description;
            this.vendor = vendor;
            this.amount = amount;
        }

        // getters
        public String getDate() {
            return date;
        }

        public String getTime() {
            return time;
        }

        public String getDescription() {
            return description;
        }

        public String getVendor() {
            return vendor;
        }

        public double getAmount() {
            return amount;
        }

        // setters
        public void setDate(String date) {
            this.date = date;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setVendor(String vendor) {
            this.vendor = vendor;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }
    }






    //Create Static Array List for transactions with the following (Date:, String, String, Int)
    //Create transaction public class
    // Create static variable called Entries. It will be an ArrayList of Transactions
    // create static variable for Payments
    //


    //Create Main menu
    // Show prompt for user showing the possible options and asking for an input
    // Create do-while loop that runs unless the user enters "E"\
    // Create switch statement that handles cases related to each menu item
    //Case 1 Add Deposit(D)
    //prompt the user for deposit information and save to CSV file
    //Case "2" Make Payment (P)
    // prompt user for debit information and save to CSV
    //Case "3" Ledger (L)
    //Display Ledger Submenu
    //Case "4" Exit
    //Exit the application

    //Ledger Menu
    //create method for ledger menu
    //Case "1" All(A)
    //Display all Entries
    //Case "2" Deposits (D)
    //Display only the entries that are deposits
    //Case "3" Payments (P)
    //Display only negative entries
    //Case "4" Reports (R)
    //Display Reports Sub Menu

    //Reports Menu
    // run predefined reports or run a custom search
    //Case "1" Month to Date
    //Show all transactions from this month to current date
    //Case "2" Previous Month
    //Show all transactions form the previous month
    // Case "3" Year to Date
    // Show all transactions from this year to current date
    // Case "4" Previous
    // Show all transactions from the prior year
    //Case "5" Search by Vendor
    //Prompt the User for Vendor name and compare to the CSV file
    //print the transactions with matching Strings

}