public class Wug {

    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    public static void ping() {
        System.out.println(".");
        baffle();
    }

    // No, I wug.
    // You wugga wug.
    // I wug.

    // baffle() at end of ping causes recursion, where it constantly goes back and forth between ping and baffle, thus printing out "wug." endlessly.

}
