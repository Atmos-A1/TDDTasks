package tdd;

import TDD.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    private Account honourAccount;

    @BeforeEach

    public void setUp() {
        honourAccount = new Account();
    }

    @Test

    public void testThatWhenI_Deposit5K_5K_Is_ReflectedInBalance(){
        assertEquals(0, honourAccount.checkBalance());
        honourAccount.deposit(5_000);
        assertEquals(5_000, honourAccount.checkBalance());

    }
    @Test
    public void testThatWhenI_Deposit_Negative1k_ZeroIs_ReflectedInBalance(){
        assertEquals(0, honourAccount.checkBalance());
        honourAccount.deposit(-1_000);
        assertEquals(0, honourAccount.checkBalance());
    }
    @Test
    public void testThatWhenI_Deposit5k_and_I_Withdraw_2k_Is_ReflectedInBalance(){
        assertEquals(0, honourAccount.checkBalance());
        honourAccount.deposit(5_000);
        assertEquals(5_000, honourAccount.checkBalance());
        honourAccount.withdraw(2_000, 1234);
        assertEquals(3_000, honourAccount.checkBalance());
    }
    @Test

    public void testThatWhenI_Deposit5k_and_I_WIthdraw_6k_5k_Is_ReflectedInBalance(){
        assertEquals(0, honourAccount.checkBalance());
        honourAccount.deposit(5_000);
        assertEquals(5_000, honourAccount.checkBalance());
        honourAccount.withdraw(6_000,1234);
        assertEquals(5_000, honourAccount.checkBalance());
    }

    @Test

    public void testThatWhenI_Deposit5k_and_I_Withdraw_Negative6k_5k_Is_ReflectedInBalance(){
        assertEquals(0, honourAccount.checkBalance());
        honourAccount.deposit(5_000);
        assertEquals(5_000, honourAccount.checkBalance());
        honourAccount.withdraw(-6_000, 1234);
        assertEquals(5_000, honourAccount.checkBalance());
    }

    @Test

    void testThatWhenI_Deposit5k_and_I_Withdraw_2k_With_The_Wrong_Pin_It_does_not_work(){
        assertEquals(0, honourAccount.checkBalance());
        honourAccount.deposit(5_000);
        assertEquals(5_000, honourAccount.checkBalance());
        honourAccount.withdraw(2_000,1235);
        assertEquals(5_000, honourAccount.checkBalance());

    }




}
