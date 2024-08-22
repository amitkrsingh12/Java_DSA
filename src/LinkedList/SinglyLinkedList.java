package LinkedList;

public class SinglyLinkedList
{
    public static Node<Integer> createLinkdedList(){
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        return  n1;
    }
    public static void printLinkedLIst(Node<Integer> head)
    {
        Node<Integer> temp =head;
        System.out.print (" LinkedList :- ");
        while(temp!=null)
        {
            System.out.print(temp.data+ " ");
            temp =temp.next;
        }
        System.out.println();
        System.out.println(temp);

    }



    public static void main(String args[]){
        Node <Integer> head = createLinkdedList();
        printLinkedLIst(head);
    //    System.out.println(head);



//        Node<Integer> n1= new Node<>(10);
//        System.out.println(n1.data);
//        System.out.println(n1.next);
    }
}
