public class MRKPirateBae{
  public static void main(String[] args) {
    Deque<String> testStr = new QQKachoo<String>();
    System.out.println("Testing with Strings... ");
    testStr.addFirst("this");
    testStr.addLast("work");
    testStr.addFirst("does");
    testStr.addLast("?");
    System.out.println("The first element: " + testStr.peekFirst());
    System.out.println("The last element: " + testStr.peekLast());
    System.out.println("The size: " + testStr.size());
    System.out.println(testStr.removeFirst());
    System.out.println(testStr.removeLast());
    System.out.println(testStr.removeFirst());
    System.out.println(testStr.removeLast());
    System.out.println("Is it empty? " + testStr.isEmpty());

    System.out.println("---------------------------------");

    Deque<Integer> testInt = new QQKachoo<Integer>();
    System.out.println("Testing with Integers... ");
    testInt.addFirst(2);
    testInt.addLast(4);
    testInt.addFirst(0);
    testInt.addLast(6);
    System.out.println("The first element: " + testInt.peekFirst());
    System.out.println("The last element: " + testInt.peekLast());
    System.out.println("The size: " + testInt.size());
    System.out.println(testInt.removeFirst());
    System.out.println(testInt.removeLast());
    System.out.println(testInt.removeFirst());
    System.out.println(testInt.removeLast());
    System.out.println("Is it empty? " + testInt.isEmpty());

    System.out.println("---------------------------------");

    Deque<Object> testObj = new QQKachoo<Object>();
    System.out.println("Testing with Objects... ");
    testObj.addFirst('z');
    testObj.addLast(false);
    testObj.addFirst(72194);
    testObj.addLast('b');
    System.out.println("The first element: " + testObj.peekFirst());
    System.out.println("The last element: " + testObj.peekLast());
    System.out.println("The size: " + testObj.size());
    System.out.println(testObj.removeFirst());
    System.out.println(testObj.removeLast());
    System.out.println(testObj.removeFirst());
    System.out.println(testObj.removeLast());
    System.out.println("Is it empty? " + testObj.isEmpty());

  }

}
