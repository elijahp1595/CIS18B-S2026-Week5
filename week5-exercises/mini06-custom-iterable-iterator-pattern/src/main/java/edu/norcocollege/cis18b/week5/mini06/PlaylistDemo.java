package edu.norcocollege.cis18b.week5.mini06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PlaylistDemo {

    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.add(new PlaylistItem("Intro", 1));
        playlist.add(new PlaylistItem("Demo", 2));
        playlist.add(new PlaylistItem("Quiz", 3));

        System.out.println("Default order: " + titles(playlist.iterator()));
        System.out.println("Priority order: " + titles(playlist.priorityIterator()));

        System.out.println("Reverse order: " + titles(playlist.reverseIterator()));
        // TODO: Add a brief reflection in your submission about when built-in iteration would be enough.
        System.out.println("\n--- Reflection ---");
        System.out.println("A built-in iterator is perfect when you just want to read your data in the exact order you added it.");
        System.out.println("However, a custom iterator is necessary when you need to process items based on specific rules (like priority or reverse order) without permanently messing up your original list.");
    }

    static List<String> titles(Iterator<PlaylistItem> iterator) {
        List<String> titles = new ArrayList<>();
        while (iterator.hasNext()) {
            titles.add(iterator.next().getTitle());
        }
        return titles;
    }
}