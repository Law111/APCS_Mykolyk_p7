/*
LJ - Lawrence Joa(Steve and John) and Joshua Gao(Batman)
APCS
HW13 -- Where do BigSibs Come From? / Adding a constructor
2021-10-06
*/


public class Greet{
	public static void main(String[] args){
		BigSib richard = new BigSib("Word up");
		String greeting = richard.greet("freshman");
		System.out.println(greeting);
	}
}
