import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.mockito.Mockito;

public class AccountOperationTest {

	private Transaction transaction = Mockito.mock(Transaction.class);
	private AccountOperation ao = new AccountOperation(transaction);
	
	@Test
	public void should_debit_when_withdraw() {
		ao.withdraw(Money.getInstanceOf(1f));
		
		verify(transaction).debit(Money.getInstanceOf(1f));
	}
	
	@Test
	public void should_credit_when_deposit() {
		ao.deposit(Money.getInstanceOf(1f));
		
		verify(transaction).credit(Money.getInstanceOf(1f));
	}
}
