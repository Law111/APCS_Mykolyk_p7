/*
LJ - Lawrence Joa(Steve and John) and Joshua Gao(Batman)
APCS
HW13 -- Where do BigSibs Come From? / Adding a constructor
2021-10-06
*/

public class BigSib{

	private String helloMsg;


	public BigSib(String r){
		helloMsg = r;
	}

	public String greet(String s){
		return helloMsg + " " + s;
	}
}
