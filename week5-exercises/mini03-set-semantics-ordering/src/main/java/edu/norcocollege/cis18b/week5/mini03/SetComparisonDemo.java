package edu.norcocollege.cis18b.week5.mini03;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetComparisonDemo {

    public static void main(String[] args) {
        List<String> tags = List.of("queue", "stack", "map", "set", "stack", "Queue");

        Set<String> hashSet = new HashSet<>(tags);
        Set<String> linkedHashSet = new LinkedHashSet<>(tags);
        Set<String> treeSet = new TreeSet<>(tags);

        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("TreeSet: " + treeSet);

        Set<String> caseInsensitive = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        caseInsensitive.addAll(tags);
        System.out.println("TreeSet (case-insensitive): " + caseInsensitive);

        // TODO: Replace with your own comparator (e.g., by length then alphabetically).
        Set<String> customOrder = new TreeSet<>(Comparator.comparingInt(String::length).thenComparing(String::compareTo));
        customOrder.addAll(tags);
        System.out.println("\n-- Explanation of Ordering Behavior ---");
        System.out.println("HashSet handles elements based on hash codes, meaning its iteration order is completely unpredictable.");
        System.out.println("LinkedHashSet preserves insertion order by maintaining a doubly-linked list through its entries.");
        System.out.println("TreeSet maintains elements in sorted order based on natural string comparison or a custom Comparator.");
        System.out.println("TreeSet (custom comparator): " + customOrder);
    }
}