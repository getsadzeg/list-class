
package src; 

// All commented codes are for testing.
public class List {
    public final int size;
    //boolean isUsed;
    private int[] list;
    private int p = 0;
    private int k = 0;
    private int clone = 0;
    private int index = 0;
     public List(int size) {
         this.size = size;
         list = new int[size];
     }
    public void getValues() {
        for(int i=0; i<list.length; i++) {
            System.out.println(list[i]);
        }
    }

    public void setList(int[] list) {
        this.list = list;
        
    }
    public void addLast(int element) {
        for(int i=0; i<list.length; i++) {
            p = list[i];
            if(p != 0) {
                k++;
                clone = p;
                index = i;
            }
             
        }
       System.out.println("clone: " + clone);
       System.out.println("index: " + index);
        System.out.println(k);
        if(clone == 0) list[0] = element;
        else list[index+1] = element;
        /*for(int i=0; i<list.length; i++) {
            System.out.println("element is " + list[i]);
        }*/
    }
    
    public void getLast() {
        for(int i=0; i<list.length; i++) {
            p = list[i];
            if(p!=0) {
                index = i;
            }
            
        }
        System.out.println("Last element: " + list[index]);
    }
    
    
    public void addFirst(int element) {
            
            /*for(int i=0; i<list.length; i++) {
            if(p!=0) {
                index = i;
            }
            }*/
            for(int i = index+1; i > 0; i--) {
            list[i] = list[i-1];
            }
            list[0] = element;
            /*for(int i=0; i<list.length; i++) {
                System.out.println(list[i]);
            }*/
    }
    public void getFirst() {
            System.out.println("First element: " + list[0]);
    }
    public void removeFirst() {
       /* System.out.println("First print:");
        for(int i=0; i<list.length; i++) {
            System.out.println(list[i]);
        }
        System.out.println("Second print:");*/
        for(int i=0; i<list.length-1; i++) {
            list[i] = list[i+1];
            //System.out.println(list[i]);
        }
         
    }
    public void removeLast() {
        //list[list.length-1] = 19;
        //System.out.println("Current value: " + list[list.length-1]);
        list[list.length-1] = 0;
        //System.out.println("After method: " + list[list.length-1]);
    }
}
