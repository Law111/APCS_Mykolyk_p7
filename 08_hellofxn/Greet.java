
// Lawrence Joa
// APCS
// HW08 -- Refactor Freshie Zero / hello function
// 2021-09-30

import java.util.Random;

public class Greet {
        public static void main(String[] args) {
                Random random = new Random();
                greet(random.nextInt(3));
        }
        public static void greet(int i){
		if(i==0){
			System.out.println("Why hello there, Foo. How do you do?");
		}
		else if(i==1){
                        System.out.println("Why hello there, Boo. How do you do?");
                }
		else{
                        System.out.println("Why hello there, Moo. How do you do?");
		}
        }
/*
DISCOVERIES:
- We reached the conclusion that "hardcoded" means pre-programmed into the function.
- We reviewed information about random from our summer prework, since we considered implementing random in the function greet().

UNRESOLVED MYSTERIES:
- Should we use random in implementing greet()? Our team numbers had separate opinions about this question.
- Without the use of random, our idea was to use if statements and case on the value of string s. However, this approach pre-determines which person will always be greeted, and the argument in the function call must be modified to change the person greeted.
*/
}
