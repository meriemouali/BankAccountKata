import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import bankAccount.BankAccount;

public class BankAccountTest {

	private BankAccount bankAccount;

	@Before
	public void init() {
		bankAccount = new BankAccount();
	}

	@Test
	public void testIntialBalanceValue() {
		assertEquals(bankAccount.getBalance(), 0);
	}

	@Test
	public void depositTest() {
		bankAccount.deposit(100);
		assertEquals(bankAccount.getBalance(), 100);

	}

	@Test
	public void withDrawlTest() {
		bankAccount.deposit(100);
		bankAccount.withDrawl(50);
		assertEquals(bankAccount.getBalance(), 50);

	}

	@Test
	public void printStatementTestTest() {

	}

	@Test
	public void TestCaseInsufficientBalance() {
		bankAccount.withDrawl(50);
		assertEquals(bankAccount.getBalance(), 0);

	}

}
