
import java.io.*;

class LinkedList {
  Node head; // head of the list

  class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
  }
  void printNthFromLast(int N) {
    int len = 0;
    Node temp = head;
    // 1) count the number of nodes in Linked List
    while (temp != null) {
      temp = temp.next;
      len++;
    }
    if (len < N)
      return;

    temp = head;

    // 2) get the (len-N+1)th node from the beginning
    for (int i = 1; i < len - N + 1; i++)
      temp = temp.next;

    System.out.println(temp.data);
  }

  public void push(int new_data) {
    Node new_node = new Node(new_data);
    new_node.next = head;
    head = new_node;
  }

  public static void main(String[] args) {
    LinkedList llist = new LinkedList();
    llist.push(20);
    llist.push(4);
    llist.push(15);
    llist.push(35);
    llist.push(33);

    llist.printNthFromLast(2);
  }
}
