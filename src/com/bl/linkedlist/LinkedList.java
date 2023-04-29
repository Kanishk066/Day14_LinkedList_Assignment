package com.bl.linkedlist;
class SortedLinkedList<T extends Comparable<T>> {
     Node<T> head;
     int size;
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        Node<T> current = head, prev = null;
        while (current != null && current.data.compareTo(data) < 0) {
            prev = current;
            current = current.next;
        }
        if (prev == null) {
            head = newNode;
        } else {
            prev.next = newNode;
        }
        newNode.next = current;
        size++;
    }
    public int size() {
        return size;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> current = head;
        while (current != null) {
            sb.append(current.data).append("->");
            current = current.next;
        }
        sb.append("null");
        return sb.toString();
    }
    private static class Node<T extends Comparable<T>> {
        T data;
        Node<T> next;
        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
      public class LinkedList {
          public static void main(String[] args) {
              System.out.println("Welcome To the Linked List Problem");
              SortedLinkedList list = new SortedLinkedList();
             list.add(56);
             list.add(30);
             list.add(40);
             list.add(70);
              System.out.println(list);
              System.out.println("Size: " +list.size());
          }
      }

