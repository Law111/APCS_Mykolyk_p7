/*
LJR - Lawrence Joa(Steve and John), Joshua Gao(Batman), and Ruby Friedman(Tiffany)
APCS
HW14 -- Customize Your Creation
2021-10-07
*/

public class Greet{
	public static void main(String[] args){
		String greeting;
		BigSib richard = new BigSib();
                BigSib doctor = new BigSib();
                BigSib kong = new BigSib();
                BigSib son = new BigSib();

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
-so
QCC
*/
