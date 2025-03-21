class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head; 
        head = newNode;      
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; 
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next; 
            }
            current.next = newNode; 
        }
    }

    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty. No node to delete.");
            return;
        }
        head = head.next;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Inserting nodes at the end
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        System.out.println("Linked List after inserting at the end:");
        list.display();

        // Inserting nodes at the beginning
        list.insertAtBeginning(5);
        System.out.println("Linked List after inserting 5 at the beginning:");
        list.display();

        // Deleting a node from the beginning
        list.deleteFromBeginning();
        System.out.println("Linked List after deleting from the beginning:");
        list.display();

        list.deleteFromBeginning();
        System.out.println("Linked List after deleting from the beginning again:");
        list.display();
    }
}