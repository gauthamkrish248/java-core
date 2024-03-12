package com.learning.core.day04;

public class BankAccount {
	private int accNo;
    private String custName;
    private String accType;
    private float balance;

    public BankAccount(int accNo, String custName, String accType, float initialBalance) throws LowBalanceException, NegativeAmount {
        this.accNo = accNo;
        this.custName = custName;
        this.accType = accType;

        if (initialBalance < 0) {
            throw new NegativeAmount("NegativeAmount!!");
        }

        if (accType.equalsIgnoreCase("saving") && initialBalance < 1000) {
            throw new LowBalanceException("LowBalance!!");
        }

        if (accType.equalsIgnoreCase("current") && initialBalance < 5000) {
            throw new LowBalanceException("LowBalance!!");
        }

        this.balance = initialBalance;
    }

    public void deposit(float amt) throws NegativeAmount {
        if (amt < 0) {
            throw new NegativeAmount("NegativeAmount!!");
        }
        balance += amt;
    }

    public float getBalance() throws LowBalanceException {
        if (balance < 1000 && accType.equalsIgnoreCase("saving")) {
            throw new LowBalanceException("LowBalance");
        }
        if (balance < 5000 && accType.equalsIgnoreCase("current")) {
            throw new LowBalanceException("LowBalance");
        }
        return balance;
    }
}
