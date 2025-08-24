package com.ritik.practiceSet.expert;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

class Transaction {
    int amount;

    public Transaction(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction{" + "amount=" + amount + '}';
    }
}

public class FilterTransactions {
    /**
     * Transaction Filtering
     * Given a list of transactions, filter all > 10,000.
     */
    public static void main(String[] args) {
        Random random = new Random();
        List<Transaction> transactions = Stream.generate(() -> new Transaction(random.nextInt(5000, 12000)))
                .limit(1000)
                .toList();

        List<Transaction> list = transactions.stream()
                .filter(transaction -> transaction.getAmount() > 10000)
                .toList();

        System.out.println(list);
    }
}
