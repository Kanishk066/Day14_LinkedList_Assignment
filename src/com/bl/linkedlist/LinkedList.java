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
      public void insert(int value, int afterValue) {
          LinkedListNode newNode = new LinkedListNode(value);

          if (head == null) {
              head = newNode;
          } else {
              LinkedListNode current = head;

              while (current != null && current.value != afterValue) {
                  current = current.Next;
              }

              if (current != null) {
                  newNode.Next = current.Next;
                  current.Next = newNode;
              }
          }
      }
      public int pop() {
          if (head == null) {
              return -1; // or throw an exception
          }
          int deletedValue = head.value;
          head = head.Next;
          return deletedValue;
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
              list.add(30);
              list.add(70);
              list.pop();
              list.printList();
          }
      }

