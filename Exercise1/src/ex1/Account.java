package ex1;

public class Account {
	
	int bal = 0;
	String id;
	String name;
	
	
	public Account(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Account(String id, String name, int bal) {
		this.id = id;
		this.name = name;
		this.bal = bal;
	}
	
	String getID() {
		return id;
	}
	
	String getName() {
		return name;
	}
	
	int getBalance() {
		return bal;
	}
	
	int credit(int amt) {
		return bal+=amt;
	}
	
	int debit(int amt) {
		if(amt<=bal) {
			bal-=amt;
		}
		else {
			System.out.println("Amount exceeded balance");
		}
		return bal;
	}

	int transferTo(int AnotherAcc, int amt) {
		if(amt<=bal) {
			this.bal=amt;
		}
		else {
			System.out.println("Amount exceeded balance");
		}
		return bal;
	}
	/*String toString() {
		return Account[id=this.id, name=this.name, balance=this.balance];
*/

}
