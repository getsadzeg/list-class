
package list.lib;

// All commented codes are for testing.
public class List implements ListInterface {
    public final int size;
    private int[] list;
    private int p = 0;
    private int k = 0;
    private int clone = 0;
    private int index = 0;
     public List(int size) {
         this.size = size;
         list = new int[size];
     }
    @Override
    public void getValues() {
        for(int i=0; i<list.length; i++) {
            if(list[i] == 0) continue;
            else System.out.println(list[i]);
        }
    }

    public void setList(int[] list) {
        this.list = list;
        
    }
    @Override
    public void addLast(int element) {
        for(int i=0; i<list.length; i++) {
            p = list[i];
            if(p != 0) {
                k++;
                clone = p;
                index = i;
            }
             
        }
        if(clone == 0) list[0] = element;
        else list[index+1] = element;
        /*for(int i=0; i<list.length; i++) {
            System.out.println("element is " + list[i]);
        }*/
    }
    @Override
    public int getLast() {
        for(int i=0; i<list.length; i++) {
            p = list[i];
            if(p!=0) {
                index = i;
            }
            
        }
        return list[index];
    }
    
    @Override
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
    @Override
    public int getFirst() {
            return list[0];
    }
    @Override
    public void removeFirst() {
        for(int i=0; i<list.length-1; i++) {
            list[i] = list[i+1];
            //System.out.println(list[i]);
        }
         
    }
    @Override
    public void removeLast() {
        list[list.length-1] = 0;
    }
}
