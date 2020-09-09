/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;


class StackOP
{
    static final int CAPACITY=5;
        
    int stack[]= new int [CAPACITY];
    int top=-1;
    public int push(int ele)
    {
        if(isfull())
        {
            return 0;
        }
        else
        {
            top=top+1;
            stack[top]=ele;
            return 1;
        }
        
    }
    public int pop()
    {
        if(isempty())
        {
            return 0;
        }
        else
        {
            int ele2;
            ele2=stack[top];
            top-- ;
            return 1;
        }
        
    }
   public void transverse()
    {
        for(int i=top;i>-1;i--)
        {
            System.out.println(stack[i]);
        }
    }

    boolean isempty()
    {
        if(top==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    boolean isfull()
    {
        if(top==CAPACITY-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        StackOP obj=new StackOP();
        obj.push(6);
        obj.push(5);
        obj.push(3);
        obj.push(2);
        obj.pop();
        obj.transverse();
        
        
    }
}
