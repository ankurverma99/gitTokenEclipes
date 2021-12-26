import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void tc() {
		Reporter.log("Hi", true);
		Reporter.log("kaise hai applog",true);
	}

}
