package bankAccount;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {

	private int balance;
	private List<Operation> operations;

	public BankAccount() {
		this.balance = 0;
		this.operations = new ArrayList<Operation>();
	}

	public int getBalance() {
		return balance;
	}

	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int amount) {
		balance += amount;
		Deposit deposit = new Deposit(amount, LocalDateTime.now(), balance);
		operations.add(deposit);
	}

	public void withDrawl(int amount) {
		if (balance >= amount) {
			balance -= amount;
			WithDrawl withDrawl = new WithDrawl(amount, LocalDateTime.now(), balance);
			operations.add(withDrawl);

		} else {
			System.out.println("Insufficient balance!!");
		}

	}

	public String printStatement() {
		String title = "DATE  || AMOUNT || BALANCE" + "\n";
		String statement = "";
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		for (Operation operation : operations) {
			statement += operation.getDate().format(format) + " || " + operation.getAmount() + " || "
					+ operation.getBalance() + "\n";

		}
		return title + statement;
	}

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.deposit(100);
		account.withDrawl(50);
		System.out.println(account.printStatement());

	}
}
