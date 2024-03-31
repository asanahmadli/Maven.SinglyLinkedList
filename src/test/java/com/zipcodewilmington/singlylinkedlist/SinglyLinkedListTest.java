package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void testAddMethod() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        Integer value = 10;
        singlyLinkedList.add(value);
        boolean actual = singlyLinkedList.contains(value);
        Assert.assertTrue(actual);
    }

    @Test
    public void testRemoveMethod() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        Integer value = 10;
        singlyLinkedList.add(value);
        singlyLinkedList.remove(value);
        boolean actual = singlyLinkedList.contains(value);
        Assert.assertFalse(actual);
    }

    @Test
    public void testFindMethod() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        Integer value = 10;
        singlyLinkedList.add(value);
        Integer actual = singlyLinkedList.find(value);
        Assert.assertEquals((Integer) 1,actual);
    }

    @Test
    public void testSizeMethod() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        Integer value = 10;
        singlyLinkedList.add(value);
        Integer expected = 1;
        Integer actual = singlyLinkedList.size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testgetMethod() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        Integer value = 10;
        singlyLinkedList.add(value);
        Integer actual = singlyLinkedList.get(value);
        Integer expected = 10;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testCopyMehtod() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        Integer value1 = 10;
        Integer value2 = 20;
        Integer value3 = 30;
        singlyLinkedList.add(value1);
        singlyLinkedList.add(value2);
        singlyLinkedList.add(value3);
        List<Integer> expected = new ArrayList<>(List.of( 10,20,30));
        List<Integer> actual = singlyLinkedList.copy(singlyLinkedList);

    }

    @Test
    public void testSortMehtod() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        Integer value1 = 20;
        Integer value2 = 10;
        Integer value3 = 30;
        singlyLinkedList.add(value1);
        singlyLinkedList.add(value2);
        singlyLinkedList.add(value3);
        List<Integer> expected = new ArrayList<>(List.of( 10,20,30));
        List<Integer> actual = singlyLinkedList.sort(singlyLinkedList);

    }


}
