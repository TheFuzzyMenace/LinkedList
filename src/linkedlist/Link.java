
package linkedlist;

/**
 * A class that represents a single linked object.
 * @author Jeremiah Zellers
 */
public class Link {
    public int index;
    public double data; //can replace this with any kind of object
    public Link next;  //Another linked object
    
    public Link(int index, double data){
        this.index = index;
        this.data = data;
        this.next = null;
    }
    
    public String toString(){
        return index + ", " + data;
    }
    
}
