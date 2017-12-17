import fr.coderetreat.bank.IBank;

/**
 * 
 * 
 *
 * Implmentation de IBank -> utilise par le client
 * C'est Adapter entre le client et nos codebase pour se libérer des contraintes pourries d'Ibank
 */
public class BankAdapter implements IBank {
	
	AccountOperationCommand todo;
	
	AccountQuery todo2;
	
	public BankAdapter(AccountOperationCommand toDoRenameCommand, AccountQuery todo2) {
		this.todo = toDoRenameCommand;
		this.todo2 = todo2;
	}

	@Override
	public void deposit(Float moneyValue) {
		todo.deposit(Money.getInstanceOf(moneyValue));
	}

	@Override
	public void WithDrawal(Float moneyValue) {
		todo.withdraw(Money.getInstanceOf(moneyValue));
		
	}

	@Override
	public String extract() {
		
		// TODO Auto-generated method stub
		return todo2.extract();
	}

}
