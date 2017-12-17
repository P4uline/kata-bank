
public class AccountOperation implements AccountOperationCommand {

	private Transaction transaction;

	public AccountOperation(Transaction transaction) {
		this.transaction = transaction;
	}

	@Override
	public void deposit(Money money) {
		transaction.credit(money);
	}

	@Override
	public void withdraw(Money money) {
		transaction.debit(money);
	}

}
