
package src;


public class Main {
    public static void main(String[] args) {
          List list = new List(10);
          list.addLast(1);
          list.addLast(5);
          list.addLast(6);
          list.removeFirst();
          list.addFirst(11);
          list.removeLast();
          list.getValues();
          System.out.println("getLast: " + list.getLast());
          System.out.println("getFirst: " + list.getFirst());
    }

}
