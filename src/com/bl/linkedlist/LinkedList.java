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

      public void deleteNode(int key) {
          LinkedListNode temp = head, prev = null;
          if (temp != null && temp.value == key) {
              head = temp.Next;
              return;
          }
          while (temp != null && temp.value != key) {
              prev = temp;
              temp = temp.Next;
          }
          if (temp == null) {
              return;
          }
          prev.Next = temp.Next;
      }
      public int size(){
          LinkedListNode currNode = head;
          int count = 0;
          while(currNode != null) {
              count++;
              currNode = currNode.Next;
          }
          return count;
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
              list.insert(40);
              list.insert(70);
              System.out.println("Original");
              list.printList();

              int key = 40;
              list.deleteNode(key);
              System.out.println("\nAfter Deleting Node with data 40");
              list.printList();

              System.out.println("\nSize of LinkedList: " + list.size());
          }
      }

