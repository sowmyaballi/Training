/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sowmya
 */
import java.util.*;
class ListNode{
    int data;
    
    ListNode next;
    ListNode(int data){
        this.data=data;
        this.next=null;
    }
}
class Linkedlist1{
    ListNode head;
    void traversal(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("Null");
    }
    void insert_at_begin(int data){
        ListNode newnode=new ListNode(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    void insert_at_end(int data){
        ListNode newnode=new ListNode(data);
        if(head==null){
            head=newnode;
            return;
        }
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        
    }
    void insert_at_position(int data,int pos){
         ListNode newnode=new ListNode(data);
         ListNode temp=head;
         int curpos=1;
         if(pos<1){
             System.out.println("Invalid position");
             return;
         }
         else if(pos==1){
             newnode.next=temp;
             temp=newnode;
             return;
         }
         else{
             while(temp!=null && curpos<pos-1){
                 temp=temp.next;
                 curpos++;
             }
             if(temp==null){
                 System.out.println("position out of range");
                 return;
             }
         }
         newnode.next=temp.next;
         temp.next=newnode;
         
        
    }
    void delete_at_begin(){
        
        head=head.next;
    }
    
}
public class linkedlist {
    public static void main(String[] args){
        Linkedlist1 ob=new Linkedlist1();
        ob.insert_at_begin(111);
        ob.insert_at_begin(222);
        ob.insert_at_begin(333);
        ob.insert_at_end(111);
        ob.insert_at_end(222);
        ob.insert_at_end(333);
        ob.insert_at_position(200, 2);
        ob.delete_at_begin();
        ob.traversal();
    }

    
}
