/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package linkedhashsets;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSets {
    public static void main(String[] args) {
        // Creating a LinkedHashSet of Strings
        Set<String> cities = new LinkedHashSet<>();

        // Adding elements (in order)
        cities.add("Colombo");
        cities.add("Kandy");
        cities.add("Galle");
        cities.add("Anuradhapura");
        cities.add("Kandy"); // Duplicate, will be ignored
        cities.add(null);    // null is allowed once

        // Displaying the set (in insertion order)
        System.out.println("Cities in LinkedHashSet:");
        for (String city : cities) {
            System.out.println(city);
        }

        // Check if a city exists
        System.out.println("\nContains 'Galle'? " + cities.contains("Galle"));

        // Remove a city
        cities.remove("Colombo");

        // Display after removal
        System.out.println("\nAfter removing 'Colombo':");
        for (String city : cities) {
            System.out.println(city);
        }

        // Size of the set
        System.out.println("\nTotal cities: " + cities.size());
    }
}
