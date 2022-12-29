import java.util.*;

class LinkedList {
    class Node {
        int item;
        Node previous;
        Node next;

        public Node(int item) {
            this.item = item;
        }
    }

    Node head, tail = null;

    public void addNode(int item) {

        Node newNode = new Node(item);

        if (head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void printNodes() {
        Node current = head;
        if (head == null) {
            System.out.println("Doubly Linked List is empty");
        } else {
            System.out.println("Nodes of doubly linked list: ");
            while (current != null) {
                System.out.print(current.item + " ");
                current = current.next;
            }
        }
    }

    public void delete(int dlt) {
        Node current = head;
        int flag = 0;
        if(head == null) {
            System.out.println("Doubly Linked List is empty");
        } else {
            if(head.item == dlt){
                flag = 1;
                //if multiple elements are present in Linked List
                if(head.next != null) {
                    head = head.next;
                    head.previous = null;
                }
                //if single element is present in Linked List
                else{
                    head = null;
                    tail = null;
                }
            }else if (tail.item == dlt){
                flag = 1;
                tail = tail.previous;
                tail.next = null;
            }
            else {
                while(current != null){
                    if(current.item == dlt){
                        current.previous.next = current.next;
                        current.next.previous = current.previous;
                        flag = 1;
                    }
                    current = current.next;
                }
            }
            if (flag==0){
                System.out.println("Element not found in linked list");
            }
        }
    }
}
public class DoublyLinkedList{
        public static void main(String[] args){
            LinkedList dl = new LinkedList();
            Scanner sc = new Scanner(System.in);
            int choice,loop,i=0,item,dlt;
            boolean option = true;
            while (option) {
                System.out.println("\nWhat would you like to do?");
                System.out.println("1 : Insertion\n2 : Deletion\n3 : Display\n4:Exit ");
                System.out.print("Your Choice: ");
                choice = sc.nextInt();

                switch(choice){
                    case 1:
                        System.out.println("How many elements would you like to enter?");
                        loop = sc.nextInt();
                        while(i<loop){
                            System.out.print("Enter element to be inserted: ");
                            item = sc.nextInt();
                            dl.addNode(item);
                            i++;
                        }break;
                    case 2:
                        System.out.print("Enter the element to delete: ");
                        dlt = sc.nextInt();
                        dl.delete(dlt);
                        break;
                    case 3:
                        dl.printNodes();
                        break;
                    case 4:
                        option = false;
                    default:
                        System.out.println("Invalid Option");
                }
            }
        }
}

