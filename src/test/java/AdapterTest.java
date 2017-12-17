import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class AdapterTest {
	
	@Test
	@Parameters({"1f", "2f", "3f"})
	public void should_deposit(float floatValue) {
		
		ToDoRenameCommand mock = mock(ToDoRenameCommand.class);
		RenameMe adapter = new RenameMe(mock);
		adapter.deposit(floatValue);
		
		Money money = Money.getInstanceOf(floatValue);
		verify(mock).deposit(money);
	}
	
	@Test
	@Parameters({"1f", "2f", "3f"})
	public void should_withdraw(float floatValue) {
		ToDoRenameCommand mock = mock(ToDoRenameCommand.class);
		RenameMe adapter = new RenameMe(mock);
		adapter.WithDrawal(floatValue);
		
		Money money = Money.getInstanceOf(floatValue);
		verify(mock).withdraw(money);
	}
}
