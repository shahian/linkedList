package com.shahian;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("hamidReza");
        linkedList.add("shahian");
        Iterator<String> stringIterator = linkedList.iterator();
        while (stringIterator.hasNext()) {

            System.out.println("traverse linkedList " + stringIterator.next());
        }
        System.out.println("-------");
        linkedList.add(0, "java");
        System.out.println("after add in 0 index to linkelist " + linkedList);
        System.out.println("-------");
        LinkedList<String> newList = new LinkedList<String>();
        newList.add("Benz");
        newList.add("BMW");
        linkedList.addAll(newList);
        System.out.println("after add new List to linkelist " + linkedList);
        System.out.println("-------");
        linkedList.addFirst("my favorite : ");
        System.out.println("after add new item in first of  linkelist " + linkedList);
        System.out.println("-------");
        linkedList.addLast("the End ");
        System.out.println("after add new item in last of  linkelist " + linkedList);
        System.out.println("-------");
        linkedList.remove("the End ");
        System.out.println("remove the End item in last of  linkelist " + linkedList);
        System.out.println("-------");
        linkedList.descendingIterator();
        System.out.println("reverse the   linkelist " + linkedList);
    }
}
