
import java.util.*;
class Linkedlist
{
    Node head;

    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }

    public void printlist()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data+" ");
            temp=temp.next;
            
        }
    }
    public void push(int d2)
    {
        Node l3=new Node(d2);
        l3.next=head;
        head=l3;
    }

    public void pushlast(int d5)
    {
        Node l5=new Node(d5);
        if(head==null)
        {
            head=new Node(d5);
           
        }
        
        
            Node temp2=head;
            l5.next=null;
            while(temp2.next!=null)
            {
                temp2=temp2.next;
                
                
            }
            temp2.next=l5;
        
    } 
    public void insertafter(Node previous,int d3)
    {
        if(previous==null)
        {
            System.out.println("it should not be null");
        }
        else{
        Node l4=new Node(d3);
        l4.next=previous.next;
        previous.next=l4;
        }
    }




    public static void main(String args[])
    {
        Linkedlist l1=new Linkedlist();
        l1.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        l1.head.next=second;
        second.next=third;
        l1.push(4);
        l1.insertafter(second,5);
        l1.pushlast(10);
        l1.printlist();
       
    }
}