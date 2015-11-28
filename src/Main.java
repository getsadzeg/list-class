
package src;


public class Main {
    public static void main(String[] args) {
         List list = new List(100);
          list.addLast(1);
          list.addLast(5);
          list.addLast(6);
          list.removeFirst();
          list.addFirst(11);
          list.removeLast();
          list.getLast();
          //list.getValues();
          
    }

}
