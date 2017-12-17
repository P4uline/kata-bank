import java.util.List;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Test;

public class ReduceTest {

	
		@Test
		public void should_test() {
			Assert.assertEquals(Stream.of(1, 2, 3, 4).reduce((sum, current)-> sum += current).get().intValue(), 10);
		}
		
		@Test
		public void should_test2() {
			Assert.assertEquals(Stream.of(1, 2, 3, 4).reduce((sum, current)-> sum + current).get().intValue(), 10);
		}
		
		
		public void test() {
			
		}
}
