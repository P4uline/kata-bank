import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class AdapterTest {
	
	

	@Test
	public void renameMe() {
		
		ToDoRenameCommand mock = mock(ToDoRenameCommand.class);
		RenameMe adapter = new RenameMe(mock);
		adapter.deposit(1f);
		
		Money money = Money.getInstanceOf(1f);
		verify(mock).deposit(money);
	}
}
