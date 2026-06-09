package edu.norcocollege.cis18b.week5.mini04;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeWorkbench {

    public static void main(String[] args) {
        runFifoDemo();
        runLifoDemo();
    }

    private static void runFifoDemo() {
        Deque<String> helpDesk = new ArrayDeque<>();

        helpDesk.addLast("import roster");
        helpDesk.addLast("email reminder");
        helpDesk.addFirst("urgent outage");
        System.out.println("--- Extension Challenge: Priority Queueing ---");
        System.out.println("Using addFirst() changes the standard FIFO semantics by allowing a high-priority task to jump to the very front of the line.\n");

        while (!helpDesk.isEmpty()) {
            System.out.println("FIFO processed: " + helpDesk.removeFirst());
        }
    }

    private static void runLifoDemo() {
        Deque<String> undoStack = new ArrayDeque<>();

        undoStack.push("rename file");
        undoStack.push("insert checkpoint");
        undoStack.push("format document");

        while (!undoStack.isEmpty()) {
            System.out.println("Undo popped: " + undoStack.pop());
        }

        // TODO: Add one more stack action and show the updated LIFO behavior.
        System.out.println("\n--- Legacy Stack Explanation ---");
        System.out.println("The legacy Java Stack class extends Vector, meaning every method is synchronized. This causes unnecessary performance overhead. Deque is interface-driven, faster, and the modern standard for stack operations.");
    }
}