package org.example;

import java.util.HashMap;
import java.util.Map;

public final class AccountStorage {
    private static Map<String, Account> accounts = new HashMap<>();

    public static Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    public static void saveAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
    }
}
