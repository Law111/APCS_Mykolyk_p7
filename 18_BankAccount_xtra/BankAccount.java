/*
Trio number int x (Orion Roven(Von Geburt), May Qiu(Perry Jr.), Lawrence Joa(Steve, John)

APCS
HW18_BankAccount (use UML diagram)
10/15/21
*/


public class BankAccount {
        private static String acctHolder;
        private static String password;
        private static int pin;
        private static int accountNum;
        private static double bal;

        public BankAccount(String name, String pw, int PinInput, int acctNum, double startBal){
                acctHolder=name;
                password = pw;
                pin=PinInput;
                accountNum=acctNum;
                bal=startBal;
        }


        public static void PrintInfo(){
                System.out.println("account holder: "+acctHolder);
                System.out.println("password: "+password);
                System.out.println("pin: "+pin);
                System.out.println("account number: "+accountNum);
                System.out.println("balance: $"+bal);
        }

        public void deposit(double money){
                bal = bal + money;
        }
        public void withdraw(double money){
                bal = bal - money;
        }

        public static void main(String[] args){
                BankAccount myDuck = new BankAccount("Von Geburt", "nunyazbizniz", 3217, 448921, 1);
                myDuck.PrintInfo();
                myDuck.deposit(500);
                myDuck.PrintInfo();
                myDuck.withdraw(1200);
                myDuck.PrintInfo();
        }
}


/*
This is alternate code for the hw, apparently not allowed(for now?) because cannot create static variables
*/

