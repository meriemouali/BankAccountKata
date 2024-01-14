package bankAccount;

import java.time.LocalDateTime;

public interface Operation {

	int getAmount();

	LocalDateTime getDate();

	int getBalance();

}
