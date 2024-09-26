package geeks.linkedlist;
//Time Complexity: O(N), where N denotes the number of nodes in the doubly linked list.
//Auxiliary Space: O(1)

class Node{
    int data ;
    Node next,prev;
        Node (int x){
        data = x;
        next = prev = null;
    }
}
public class reversedll {
    Node head;
    void reverse (){
        Node temp = null;
        Node curr = head;

        while(curr != null){
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        if(temp!=null){
            head = temp.prev;
        }
    }
    void push (int new_data){
        Node new_node = new Node(new_data);
            new_node.prev = null;
            new_node.next = head;

            if(head != null){
                head.prev= new_node;
            }
            head = new_node;
        }
        void printlist(Node node){
            if (node == null) {
                System.out.println("List is empty.");
                return;
            }
            while (node!= null){
                System.out.print(node.data +" ");
                node = node.next;
            }
            System.out.println();
        }
        public static void main (String []args){
            reversedll list = new reversedll();

            list.push(10);
            list.push(20);
            list.push(30);
            list.push(40);

            System.out.println("Original linked list :");
		    list.printlist(list.head);

		// Function call
		    list.reverse();

		    System.out.println("The reversed Linked List is :");
	    	list.printlist(list.head);
        }
    }

