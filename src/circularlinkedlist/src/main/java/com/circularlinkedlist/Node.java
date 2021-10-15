/**
 *  Filename: Node.java
 */

package com.circularlinkedlist;

// Node class
public class Node 
{
    public int data;
    public Node next;
    
    public Node()
    {
        data = -1;
        next = null;
    }
    
    public String toString()
    {
        return String.format("%d\n", data);
    }
};
