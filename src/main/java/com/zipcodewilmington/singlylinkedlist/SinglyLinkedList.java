package com.zipcodewilmington.singlylinkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {

    List<T> list = new ArrayList<>();

    public void add(Integer value) {
        list.add((T) value);
    }

    public boolean contains(Integer value) {
        return list.contains(value);
    }

    public void remove(Integer value) {
        list.remove(value);
    }

    public Integer find(Integer value) {
        if(list.contains(value)){
            return list.indexOf(value);
        }
        else {
            return -1;
        }
    }

    public Integer size() {
        return list.size();
    }

    public Integer get(Integer value) {
        return (Integer) list.get(value);
    }

    public List<Integer> sort(SinglyLinkedList singlyLinkedList) {
        return singlyLinkedList.sort(singlyLinkedList);
    }

    public List<Integer> copy(SinglyLinkedList singlyLinkedList) {
        return null;
    }


//    private Node head;
//
//    public class Node{
//        private int data;
//        private Node next;
//
//        public Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    public void add(int data) {
//        Node newNode = new Node(data);
//        newNode.next = head;
//        head = newNode;
//    }
//
//    public void remove(int data) {
//        Node currentNode = head;
//        Node previousNode = null;
//
//        while (currentNode != null && currentNode.data != data) {
//            previousNode = currentNode;
//            currentNode = currentNode.next;
//        }
//
//        if (currentNode != null) {
//            if (previousNode == null) {
//                head = currentNode.next;
//            } else {
//                previousNode.next = currentNode.next;
//            }
//        }
//    }
//
//    public int find(int data) {
//        Node currentNode = head;
//
//        while (currentNode != null && currentNode.data != data) {
//            currentNode = currentNode.next;
//        }
//
//        if (currentNode != null) {
//            return currentNode.data;
//        } else {
//            return -1;
//        }
//    }
//
//    public boolean contains(int data){
//        Node currentNode = head;
//        return
//    }



}
