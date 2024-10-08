package DataStructure.LinkedList;


public class LinkedListUse
{
    public static Node<Integer> createLinkedList()
    {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next =n2;
        n2.next=n3;
        n3.next=n4;
        return n1;
    }
    public static void print(Node<Integer> head){
        System.out.println("Print : -------------");
        Node<Integer> temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void increment(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp!=null){
            temp.data++;
            temp=temp.next;
        }
    }
    public static void main(String args[]){

        Node<Integer> head = createLinkedList();
        increment(head);
        print(head);

    //the below print function runs because it intializes head again
    //    print(head);


//        Node<Integer> n1 = new Node<>(10);
//        System.out.println(n1);
//        System.out.println(n1.data);
//        System.out.println(n1.next);

    }
}
