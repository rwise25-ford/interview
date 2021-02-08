package com.q3;

public interface Set {

    // Implement methods in order?

    // Indicates whether the Set has any anything in it or not.
    boolean isEmpty();

    // Add elements to the Set with no duplicates.
    void add(String stringToAdd);

    // Get the number of items in the set.
    int getSize();

    // Returns index position if Set has String.
    // Returns -1 if Set does not contain a String.
    int contains(String string);

    // Remove a String from the Set. Order of the Strings in the Set matters.
    void remove(String stringToRemove);

    // Remove all items from the Set.
    void clear();

    // Add multiple items to the Set
    void addAll(String [] stringArray);
}