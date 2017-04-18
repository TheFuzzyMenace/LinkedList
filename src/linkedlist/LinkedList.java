package linkedlist;

/**
 *
 * @author Jeremiah E. Zellers
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

    public Link find(double key) {
        //how to find things in our list
        Link current = first;
        while (current.data != key) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    public Link delete(int index) {
        Link current = first;
        Link previous = first;
        if (!isEmpty()) {
            int count = 0;
            while (count != index) {
                if (current.next == null) {
                    return null;
                } else {
                    previous = current;
                    current = current.next;
                }
                count++;
            }
            if (current == first) {
                first = first.next;
            } else {
                previous.next = current.next;
            }
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
        System.out.println("The list of double values is\n" + list);
//----------------------------Find Section Main---------------------------------
        System.out.println("Math for item 39.2 is: " + list.find(39.2));
        System.out.println("Math for item 25.1 is: " + list.find(25.1));
        System.out.println("Math for item 10.3 is: " + list.find(10.3));
        System.out.println("Math for item 0 is: " + list.find(0));
        System.out.println("\n");
        
//---------------------------Delete Section Main-------------------------------        

        if (list.delete(0) != null) {
            System.out.println("Item deleted. New list is: " + "\n" + list);
        } else {
            System.out.println("Null value on delete");
        }

        if (list.delete(1) != null) {
            System.out.println("Item deleted. New list is: " + "\n" + list);
        } else {
            System.out.println("Null value on delete");
        }

    }

}
