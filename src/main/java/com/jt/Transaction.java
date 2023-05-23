package com.jt;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Transaction {

    // Properties
    private String date;
    private String time;
    private String description;
    private String vendor;
    private double amount;

    // Constructors
    public Transaction(String date, String time, String description, String vendor, double amount) {
        this.date = date;
        this.time = time;
        this.description = description;
        this.vendor = vendor;
        this.amount = amount;
    }

    public Transaction() {}

    // Getters and setters
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

    // Transaction Manager
    public class TransactionManager {
        private static final String DATE_FORMAT = "yyyy-MM-dd";
        private static final String TIME_FORMAT = "HH:mm:ss";
        private static final String FILE_HEADER = "date|time|description|vendor|amount\n";
        private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#.00");
        private final String fileName;
        private final List<Transaction> transactions;

        public TransactionManager(String fileName) {
            this.fileName = fileName;
            this.transactions = new ArrayList<>();
            readTransactionsFromFile();
        }

        private void addTransaction(Transaction transaction) {
            transactions.add(transaction);
            writeTransactionsToFile();
        }

        public void addDeposit() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter deposit date (yyyy-mm-dd): ");
            String dateString = scanner.nextLine();

            System.out.print("Enter deposit time (hh:mm:ss): ");
            String timeString = scanner.nextLine();

            System.out.print("Enter deposit description: ");
            String description = scanner.nextLine();

            System.out.print("Enter deposit vendor: ");
            String vendor = scanner.nextLine();

            System.out.print("Enter deposit amount: ");
            String amountString = scanner.nextLine();
            double amount = Double.parseDouble(amountString);

            addTransaction(new Transaction(dateString, timeString, description, vendor, amount));
        }

        public void makePayment() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter payment date (yyyy-mm-dd): ");
            String dateString = scanner.nextLine();

            System.out.print("Enter payment time (hh:mm:ss): ");
            String timeString = scanner.nextLine();

            System.out.print("Enter payment description: ");
            String description = scanner.nextLine();

            System.out.print("Enter payment vendor: ");
            String vendor = scanner.nextLine();

            System.out.print("Enter payment amount: ");
            String amountString = scanner.nextLine();
            double amount = Double.parseDouble(amountString) * -1;

            addTransaction(new Transaction(dateString, timeString, description, vendor, amount));
        }

        private void readTransactionsFromFile() {
            try {
                File file = new File(fileName);
                Scanner scanner = new Scanner(file);{
                }


                // Skip header
