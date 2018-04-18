package Accounts;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;


public class App {
	
	
	public class Account {

		public void main(String args[]) {
			
			Service application = new Service();
			
			application.addAccounts("suleman", "aslam", "123");
			application.addAccounts("Tom", "Lee", "124");
			application.addAccounts("David", "Parkington", "123");
			
			application.newMap();

	}
	}









}
