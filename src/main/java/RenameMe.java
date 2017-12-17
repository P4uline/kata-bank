import fr.coderetreat.bank.IBank;

public class RenameMe implements IBank {
	
	ToDoRenameCommand todo;
	
	public RenameMe(ToDoRenameCommand toDoRenameCommand) {
		this.todo = toDoRenameCommand;
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
		return null;
	}

}
