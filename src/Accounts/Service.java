package Accounts;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import Accounts.App.Account;

public class Service {

static int id = 1;
	
	HashMap<Integer, Account >accountsHolder = new HashMap<Integer, Account >();

	public void addAccounts (String firstName, String lastName, String accountNo) {
		
		Account accounts = new Account();
		
		accountsHolder.put(id, accounts);
		id++;
	}
	
	public void getAccounts(Account accounts) {
		accounts.toString();
	}
	public void newMap() {
		
		Set<Entry<Integer, Account>> hashset=accountsHolder.entrySet();
		for(Entry entry:hashset) {
		
		System.out.println(entry.getKey()+ ", "+ entry.getValue());
		
		
		
	}
	
	}
	
}

	
	

