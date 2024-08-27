package LinkedList;

import java.util.LinkedList;

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
    public static void increment(Node <Integer> head){
        Node <Integer> temp =head;
        while(temp!=null)
        {
            temp.data++;
            temp = temp.next;

        }
    }
    public static Node<Integer> insert(Node<Integer> head,int elem,int pos){
        Node<Integer> nodetobeInserted = new Node<>(elem);
        if(pos==0){
            nodetobeInserted.next=head;
            return nodetobeInserted;
        }else{
            int count =0;
            Node<Integer> prev =head;
            while(count<pos -1 && prev!=null){
                count++;
                prev=prev.next;
            }
            if(prev.next !=null){
                nodetobeInserted.next =prev.next;
                prev.next = nodetobeInserted;
            }
            return  head;
        }
    }
    public static Node<Integer> deleteNode(Node<Integer> head,int pos){
        if(head==null){
            return head;
        }
        if(pos==0){
            return head.next;
        }
        int count=0;
        Node<Integer> currHead =head;
        while (currHead != null && count < pos - 1) {

            currHead =currHead.next;
            count++;
        }
        if(currHead==null||currHead.next==null){
            return head;
        }
        currHead.next = currHead.next.next;
        return head;

    }
    public static void printR(Node<Integer> head)
    {
        if(head==null)
        {
            return;
        }
        System.out.print(head.data+ " ");
        printR(head.next);
    }





    public static void main(String args[]){
        Node <Integer> head = createLinkdedList();
        printR(head);

//        increment(head);
//        insert(head,90,3);
//        printLinkedLIst(head);
//        deleteNode(head,3);
//        printLinkedLIst(head);
//        System.out.println(head);



//        Node<Integer> n1= new Node<>(10);
//        System.out.println(n1.data);
//        System.out.println(n1.next);
    }
}
