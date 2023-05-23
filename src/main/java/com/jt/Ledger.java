package com.jt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Ledger {

    public static class ledger {
        private ArrayList<Transaction> transactions;

        public ledger() {
            transactions = new ArrayList<Transaction>();
        }
        public class Transaction {
            private String date;
            private String time;
            private String description;
            private String vendor;
            private double amount;

            public Transaction() {
            }

            public Transaction(String date, String time, String description, String vendor, double amount) {
                this.date = date;
                this.time = time;
                this.description = description;
                this.vendor = vendor;
                this.amount = amount;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getVendor() {
                return vendor;
            }

            public void setVendor(String vendor) {
                this.vendor = vendor;
            }

            public double getAmount() {
                return amount;
            }

            public void setAmount(double amount) {
                this.amount = amount;
            }

            @Override
            public String toString() {
                return date + "|" + time + "|" + description + "|" + vendor + "|" + amount;
            }
        }

        public void displayAllTransactions() {
            Collections.reverse(transactions);
            for (Transaction transaction : transactions) {
                System.out.println(transaction.toString());
            }
        }

        public void displayDeposits() {
            for (Transaction transaction : transactions) {
                if (transaction.getAmount() > 0) {
                    System.out.println(transaction.toString());
                }
            }
        }

        public void displayPayments() {
            for (Transaction transaction : transactions) {
                if (transaction.getAmount() < 0) {
                    System.out.println(transaction.toString());
                }
            }
        }

        public void displayReports() {
            System.out.println("Select a report option:");
            System.out.println("1) Month To Date");
            System.out.println("2) Previous Month");
            System.out.println("3) Year To Date");
            System.out.println("4) Previous Year");
            System.out.println("5) Search by Vendor");
            System.out.println("0) Back");

            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    // generate month to date report
                    break;
                case 2:
                    // generate previous month report
                    break;
                case 3:
                    // generate year to date report
                    break;
                case 4:
                    // generate previous year report
                    break;
                case 5:
                    System.out.println("Enter vendor name:");
                    String vendorName = scanner.next();
                    for (Transaction transaction : transactions) {
                        if (transaction.getVendor().equals(vendorName)) {
                            System.out.println(transaction.toString());
                        }
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        public void loadTransactionsFromFile(String filename) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(filename));
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split("\\|");
                    String date = parts[0];
                    String time = parts[1];
                    String description = parts[2];
                    String vendor = parts[3];
                    double amount = Double.parseDouble(parts[4]);
                    Transaction transaction = new Transaction(date, time, description, vendor, amount);
                    transactions.add(transaction);
                }
                reader.close();
            } catch (IOException e) {
                System.out.println("Error reading transactions from file: " + e.getMessage());
            }
        }
    }

}
