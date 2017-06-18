package com.rubyalliance.cims.courses.sp17.datastructures.lab2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;


/**
 * Created by fredf on 1/31/2017.
 */

public class BankTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void openAccount() {
        Bank bank = new Bank();
        Account account = bank.openAccount();
        assertEquals(account.accountNum,10000);
        assertTrue(bank.getAccount(account.getAccountNumber())!=null);
    }

    @Test
    public void openChecking() throws Exception {
        Bank bank = new Bank();
        Account account = bank.openChecking(0,-100);
        account.withdraw(50);
        assertEquals(account.getBalance(),-50.0);
        assertTrue(bank.getAccount(account.getAccountNumber())!=null);
        assertTrue(outContent.toString().contains("Withdraw Successful"));
    }

    @Test
    public void updateAll() throws Exception {
        Bank bank = new Bank();
        Account account = bank.openChecking(0,-100);
        account.withdraw(50);
        account = bank.openSavings(10,0.1);
        bank.updateAll();
        assertEquals(bank.getAccount(account.getAccountNumber()).getBalance(),11.0);
        assertTrue(outContent.toString().contains("Account balance less than 0"));
    }
}