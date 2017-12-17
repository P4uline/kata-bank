import fr.coderetreat.bank.IBank;

/**
 * 
 * 
 *
 * Implmentation de IBank -> utilise par le client
 * C'est Adapter entre le client et nos codebase pour se libérer des contraintes pourries d'Ibank
 */
public class BankAdapter implements IBank {
	
	private AccountOperationCommand accountOperationCommand;
	
	private AccountQuery accountQuery;
	
	public BankAdapter(AccountOperationCommand toDoRenameCommand, AccountQuery todo2) {
		this.accountOperationCommand = toDoRenameCommand;
		this.accountQuery = todo2;
	}

	@Override
	public void deposit(Float moneyValue) {
		accountOperationCommand.deposit(Money.getInstanceOf(moneyValue));
	}

	@Override
	public void WithDrawal(Float moneyValue) {
		accountOperationCommand.withdraw(Money.getInstanceOf(moneyValue));
		
	}

	@Override
	public String extract() {
		
		// TODO Auto-generated method stub
		return accountQuery.extract();
	}

}
