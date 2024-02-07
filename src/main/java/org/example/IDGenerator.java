package org.example;

import java.util.concurrent.atomic.AtomicInteger;

public final class IDGenerator {
    private static AtomicInteger counter = new AtomicInteger(0);

    public static String generateAccountNumber() {
        counter.incrementAndGet();

        String accountNumber = counter.toString();

        while (accountNumber.length() < 6) {
            accountNumber = "0".concat(accountNumber);
        }
        return accountNumber;
    }
}
