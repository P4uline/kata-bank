import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class AdapterTest {
	
	private AccountQuery accountQueryMock = mock(AccountQuery.class);
	private AccountOperationCommand accountOperationCommandMock = mock(AccountOperationCommand.class);
	private BankAdapter adapter = new BankAdapter(accountOperationCommandMock, accountQueryMock);
	
	@Test
	@Parameters({"1f", "2f", "3f"})
	public void should_deposit(float floatValue) {
		adapter.deposit(floatValue);
		
		Money money = Money.getInstanceOf(floatValue);
		verify(accountOperationCommandMock).deposit(money);
		verify(accountQueryMock, Mockito.never()).extract();
		verify(accountOperationCommandMock, Mockito.never()).withdraw(Mockito.any());
	}
	
	@Test
	@Parameters({"1f", "2f", "3f"})
	public void should_withdraw(float floatValue) {
		adapter.WithDrawal(floatValue);
		
		Money money = Money.getInstanceOf(floatValue);
		verify(accountOperationCommandMock).withdraw(money);
		verify(accountOperationCommandMock, Mockito.never()).deposit(Mockito.any());
		verify(accountQueryMock, Mockito.never()).extract();
	}
	
	@Test
	public void should_extract() {
		adapter.extract();
		
		verify(accountQueryMock).extract();
		verify(accountOperationCommandMock, Mockito.never()).deposit(Mockito.any());
		verify(accountOperationCommandMock, Mockito.never()).withdraw(Mockito.any());
	}
}
