package com.linkedlist;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList of strings
        LinkedList<String> friends = new LinkedList<>();

        // Add elements to the LinkedList
        friends.add("Sourabh");
        friends.add("Rohit");
        friends.add("Mohit");
        friends.add("Tejash");

        // Display the LinkedList
        System.out.println("Original LinkedList: " + friends);

        // Add an element at the first position
        friends.addFirst("Tejash");
        System.out.println("After adding Priya at the beginning: " + friends);

        // Add an element at the last position
        friends.addLast("Rohit");
        System.out.println("After adding Sneha at the end: " + friends);

        // Remove an element by index
        friends.remove(2); // Removes the element at index 2
        System.out.println("After removing the element at index 2: " + friends);

        // Get the first and last elements
        System.out.println("First element: " + friends.getFirst());
        System.out.println("Last element: " + friends.getLast());

        // Check if a specific element exists
        if (friends.contains("Sourabh")) {
            System.out.println("Sourabh is in the list.");
        } else {
            System.out.println("Sourabh is not in the list.");
        }

        // Iterate through the LinkedList using a for-each loop
        System.out.println("\nIterating through the LinkedList:");
        for (String friend : friends) {
            System.out.println(friend);
        }
    }
}
