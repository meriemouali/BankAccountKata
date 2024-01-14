package bankAccount;

import java.time.LocalDateTime;

public class WithDrawl implements Operation {
	private int amount;
	private LocalDateTime date;
	private int balance;

	public WithDrawl(int amount, LocalDateTime date, int balance) {
		super();
		this.amount = amount;
		this.date = date;
		this.balance = balance;
	}

	@Override
	public int getAmount() {
		return -amount;
	}

	@Override
	public LocalDateTime getDate() {
		return date;
	}

	@Override
	public int getBalance() {
		return balance;
	}

}
