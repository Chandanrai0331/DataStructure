

import java.util.*;
class Node
{
 
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        right=left=null;
    }
}

public class Practice
{
    
    public void preorder(Node node)
    {
        if(node==null)
        {return;}
        else{
            
            System.out.println(node.data);
            preorder(node.left);
            
            
            preorder(node.right);
        }
    }
    public static void main(String args[])
    {
        Practice obj=new Practice();
        Node root=new Node(3);
        root.left=new Node(5);
        root.right=new Node(8);
        obj.preorder(root);
    }
}
