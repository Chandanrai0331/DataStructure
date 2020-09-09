

import java.util.*;
class Node 
{
    
    int data;
    Node  left,right;
    Node(int k)
    {
        data=k;
        left=right=null;
    }
}

class binarytree
{
    
    
    
    public void inorder(Node node)
    {
    
        if(node==null)
        {return ;}

        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
    }
    public void preorder(Node node)
    {
    
        if(node==null)
        {return ;}
        System.out.print(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }
    public void postorder(Node node)
    {
    
        if(node==null)
        {return ;}
     
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data+" ");
    }


    public static void main(String args[])
    {
        binarytree obj=new binarytree();
        Node root=new Node(1);

        root.left=new Node(4);
        root.right=new Node(6);
        obj.inorder(root);
        System.out.println();
        obj.preorder(root);
        System.out.println();
        obj.postorder(root);


    }
}