import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class MoneyTest {
	
	@Test
	public void should_rename() {
		Money money = Money.getInstanceOf(1f);
		
		assertEquals(1f, money.value(), 0f);
	}
	
	@Test(expected=IllegalStateException.class)
	@Parameters({"0f", "-1f", "-2f", "-245f", "1.001f"})
	public void should_not_allow_to_instance(float money) {
		Money.getInstanceOf(money);
	}

}
