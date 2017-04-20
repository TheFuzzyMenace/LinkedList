package linkedlist;

/**
 * A class that represents a single linked object.
 *
 * @author Jeremiah E. Zellers
 */
public class Link {

    public Friend data; //can replace this with any kind of object
    public Link next;  //Another linked object

    public Link(Friend data) {

        this.data = data;
        this.next = null;
    }

    public String toString() {
        return  data.toString();
    }

}
