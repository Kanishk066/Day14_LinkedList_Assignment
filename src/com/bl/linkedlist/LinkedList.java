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

      public void addInfront(int value) {
          LinkedListNode newNode = new LinkedListNode(value);
          if (head == null) {
              head = newNode;
          } else {
              newNode.Next = head;
              head = newNode;
          }
      }

      public void append(int value) {
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
              list.add(56);
              list.append(30);
              list.append(70);
              list.printList();
          }
      }

