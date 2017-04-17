package linkedlist;

/**
 *
 * @author Administrator
 */
public class LinkedList {

    private Link first;

    public LinkedList() {
        this.first = null; //no first link created yet is why null (nothing in list yet)
    }

    public boolean isEmpty() {
        //this should be used in every list
        return (first == null); //looks at link named first. if it's null.. returns "true"
    }

    public void insertFirst(int index, double data) {
        Link newLink = new Link(index, data); //creates this new link.. and then the next link becomes null
        newLink.next = first;
        first = newLink;
        //give it index (int index) and data (our object or data) we want to insert first
    }

    public Link deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public Link find(int key) {
        //how to find things in our list
        Link current = first;
        while (current.index != key) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    public Link delete(int key) {
        Link current = first;
        Link previous = first;
        while (current.index != key) {
            if (current.next == null) {
                return null;
            } else {
                previous = current;
                current = current.next;
            }
        }
        if (current == first) {
            first = first.next;
        } else {
            previous.next = current.next;
        }
        return current;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("");
        Link current = first;

        while (current != null) {
            sb.append(current.toString()).append("\n");
            current = current.next; //current becoms the next object in the list
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(1, 25.1);
        list.insertFirst(2, 39.2);
        list.insertFirst(3, 10.3);

        
        System.out.println(list.toString()); 
        System.out.println("Match for item 2: " + list.find(2)); 
        System.out.println("match for item 4: " + list.find(4)); // should be null
        list.delete(2);
        System.out.println(list.toString()); // object at index 2 is now deleted
    }

}
