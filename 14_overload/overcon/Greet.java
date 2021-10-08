/*
LJR - Lawrence Joa(Steve and John), Joshua Gao(Batman), and Ruby Friedman(Tiffany)
APCS
HW14 -- Customize Your Creation
2021-10-07
*/

public class Greet{
	public static void main(String[] args){
		String greeting;
		BigSib richard = new BigSib("Word up");
                BigSib doctor = new BigSib("Salutations");
                BigSib kong = new BigSib("Hey ya");
                BigSib son = new BigSib("Sup");

		greeting = richard.greet("freshman");
                System.out.println(greeting);
                greeting = doctor.greet("Dr. Spaceman");
                System.out.println(greeting);
                greeting = kong.greet("Kong Fooey");
                System.out.println(greeting);
                greeting = son.greet("mom");
                System.out.println(greeting);
	}
}
/*
DISCOS
- default constructor "public BigSib()" takes no params
- overloaded constructor same class name, diff params
QCC
*/
