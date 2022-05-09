		

		package suitea;
		
		import org.testng.annotations.Test;
		import org.testng.annotations.Test;
		
		import testbase.TestBase;
		
		public class TestA extends TestBase {
		
			@Test
			public void testA() throws InterruptedException {
				log("-- Start A --");
				Thread.sleep(1000);
				log("-- Ending A --");
			}
		}
