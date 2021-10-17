/*
Trio number int x (Orion Roven, May Qiu, Lawrence Joa)
APCS
HW18_BankAccount (use UML diagram)
10/15/21
*/

public class BankAccount {
	private String acctHolder;
	private String password;
	private int pin;
	private int accountNum;
	private double bal;

	public void SetAcctHolder(String name){
		acctHolder=name;
	}

	public void SetPassword(String pw){
		password=pw;
	}

	public void SetPin(int PinInput){
		pin=PinInput;
	}

	public void SetAcctNum(int acctNum){
		accountNum=acctNum;
	}

	public void SetBal(double startBal){
		bal=startBal;
	}

	public static void main(String[] args){
		BankAccount myDuck = new BankAccount();

		myDuck.SetAcctHolder("Von Geburt");
		myDuck.SetPassword("nunyazbizniz");
		myDuck.SetPin(3217);
		myDuck.SetAcctNum(448921);
		myDuck.SetBal(1);

		System.out.println("account holder: "+myDuck.acctHolder);
		System.out.println("password: "+myDuck.password);
		System.out.println("pin: "+myDuck.pin);
		System.out.println("account number: "+myDuck.accountNum);
		if (myDuck.bal==1) {
			System.out.println("balance: "+myDuck.bal+" dollar");
		} else {
			System.out.println("balance: "+myDuck.bal+" dollars");
		}
	}
}

