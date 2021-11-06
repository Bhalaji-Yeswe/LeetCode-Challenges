package com.company;
class ListNode
{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {this.val = val;}
    ListNode(int val,ListNode next) {this.val = val;this.next = next;}
}

class Main {

    public static ListNode head;

    public void push(int new_data)
    {
        ListNode node = new ListNode(new_data);
        node.next = head;
        head = node;
    }

    public static void main(String[] args) {
	// write your code here
     Main ll = new Main();
     ll.push(1);
     ll.push(2);
     ll.push(3);

     ListNode temp = head;
     int k =3;
     int totalLen  = 0;
     while (temp!=null)
     {
         totalLen++;
         temp = temp.next;
     }
     int distributor = totalLen/k;
     ListNode split = head;
     ListNode[] ans = new ListNode[k];
     int i = 0;
     while (split!=null)
     {
         ans[i] = split;
     }
    }
}
