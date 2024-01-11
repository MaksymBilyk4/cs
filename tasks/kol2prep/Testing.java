package kol2prep;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

class Testing {
    public static void main(String[] args) {
        Account a1 = new Account(200);
        Account a2 = new Account(1000);

        AccountService accountService = new AccountService();
        accountService.addAccount(a1);
        accountService.addAccount(a2);
        try {
            a2.sendMoney(a1, 500);
            System.out.println("Account 1 " + a1);
            System.out.println("Account 2 " + a2);
        } catch (NotEnoughMoneyException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(accountService.accounts);
        try {
            System.out.println("found acc -> " + accountService.findAccountByNumber(a1.getNumber()));
            System.out.println("found acc -> " + accountService.findAccountByNumber("1dsadas"));
        }catch (AccountNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

class Account {
    private int moneyCount;
    private String number = String.valueOf(UUID.randomUUID());

    public Account(int moneyCount) {
        this.moneyCount = moneyCount;
    }

    public void sendMoney(Account account, int amount) throws NotEnoughMoneyException {
        if (amount > this.moneyCount) {
            throw new NotEnoughMoneyException("Not enough money");
        }
        account.setMoneyCount(account.getMoneyCount() + amount);
        this.moneyCount -= amount;
    }

    public int getMoneyCount() {
        return moneyCount;
    }

    public void setMoneyCount(int moneyCount) {
        this.moneyCount = moneyCount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "moneyCount=" + moneyCount +
                ", number='" + number + '\'' +
                '}';
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

class NotEnoughMoneyException extends Exception {


    public NotEnoughMoneyException(String message) {
        super(message);
    }
}

class AccountNotFoundException extends Exception {

    public AccountNotFoundException(String message) {
        super(message);
    }

}

class AccountService {

    List<Account> accounts = new ArrayList<>();

    public void addAccount (Account account) {
        if (account == null) throw new NullPointerException("Account is not defined at add account method");
        accounts.add(account);
    }

    public Account findAccountByNumber(String number) throws AccountNotFoundException {
        Account account = null;
        for (Account a: accounts) {
            if (a.getNumber().equals(number)) {
                account = a;
                break;
            }
        }

        if (account != null) return account;
        throw new AccountNotFoundException("Account with number " + number + " not found");
    }

}