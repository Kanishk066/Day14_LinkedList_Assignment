package com.bl.linkedlist;
class LinkedListNode{
    int value;
    LinkedListNode Next;
    public LinkedListNode(int value){
        this.value = value;
        this.Next = null;
    }
}
  class LinkedList1 {
      LinkedListNode head;

      public LinkedList1() {
          this.head = null;
      }
      public void insertAfter(LinkedListNode prevNode, int newValue){
          if (prevNode == null) {
              System.out.println("The given previous node cannot be null");
              return;
          }
          LinkedListNode newNode = new LinkedListNode(newValue);
          newNode.Next = prevNode.Next;
          prevNode.Next = newNode;
      }
      public void add(int value) {
          LinkedListNode newNode = new LinkedListNode(value);
          if (head == null) {
              head = newNode;
          } else {
              LinkedListNode current = head;

              while (current.Next != null) {
                  current = current.Next;
              }
              current.Next = newNode;
          }
      }
      public void insert(int newValue) {
          LinkedListNode newNode = new LinkedListNode(newValue);
          if (head == null) {
              head = newNode;
              return;
          }
          newNode.Next = null;
          LinkedListNode last = head;
          while (last.Next != null) {
                  last = last.Next;
              }
          last.Next = newNode;
          }
      public void printList() {
              LinkedListNode current = head;
              while (current != null) {
                  System.out.println(" " + current.value);
                  current = current.Next;
              }
          }
      }
      public class LinkedList {
          public static void main(String[] args) {
              System.out.println("Welcome To the Linked List Problem");
              LinkedList1 list = new LinkedList1();
              list.insert(56);
              list.insert(30);
              list.insert(70);
              System.out.println("Original");
              list.printList();

              LinkedListNode prevNode = list.head.Next;
              int newValue = 40;
              list.insertAfter(prevNode, newValue);
              System.out.println("\nAfter Inserting 40 after 30");
              list.printList();
          }
      }

