package com.q3.kotlin_version


/*
// Implement set using an Array of Strings of size 5
// add minimal code to make the tests pass

// Test case naming convention
// <action/functionName>_<Conditions>_<result>

    // Implement methods in order

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
* */

import com.q3.java_version.SetImpl
import org.junit.Assert.assertFalse
import org.junit.Test

class SetImplTest {

/*
    @Test
    fun remove_hasItem_removesItem() {
        val set = SetImpl()
        set.add("a")
        assertEquals(1, set.getSize())
        assertEquals(0, set.contains("a"))
        set.remove("a")
        assertEquals(-1, set.contains("a"))
        assertEquals(0, set.getSize())
    }

    @Test
    fun remove_removesMiddleItem_removesItemAndHasRemainingItemsInProperSequency() {
        val set = SetImpl()
        set.add("a")
        set.add("b")
        set.add("c")
        set.add("d")
        assertEquals(4, set.getSize())
        assertEquals(1, set.contains("b"))
        set.remove("b")
        assertEquals(0, set.contains("a"))
        assertEquals(-1, set.contains("b"))
        assertEquals(1, set.contains("c"))
        assertEquals(2, set.contains("d"))
        assertEquals(3, set.getSize())
    }

    @Test
    fun remove_removesFirstItem_removesItemAndHasRemainingItemsInProperSequency() {
        val set = SetImpl()
        set.add("a")
        set.add("b")
        set.add("c")
        set.add("d")
        assertEquals(4, set.getSize())
        assertEquals(1, set.contains("b"))
        set.remove("a")
        assertEquals(-1, set.contains("a"))
        assertEquals(0, set.contains("b"))
        assertEquals(1, set.contains("c"))
        assertEquals(2, set.contains("d"))
        assertEquals(3, set.getSize())
    }

    @Test
    fun remove_removesLastItem_removesItemAndHasRemainingItemsInProperSequence() {
        val set = SetImpl()
        set.add("a")
        set.add("b")
        set.add("c")
        set.add("d")
        assertEquals(4, set.getSize())
        assertEquals(3, set.contains("d"))
        set.remove("d")
        assertEquals(0, set.contains("a"))
        assertEquals(1, set.contains("b"))
        assertEquals(2, set.contains("c"))
        assertEquals(-1, set.contains("d"))
        assertEquals(3, set.getSize())
    }

    @Test
    fun remove_setIsAtMaxSize_removesItemAndHasRemainingItemsInProperSequence() {
        val set = SetImpl()
        set.add("1")
        set.add("2")
        set.add("3")
        set.add("4")
        set.add("5")
        assertEquals(5, set.getSize())
        assertEquals(4, set.contains("5"))
        set.remove("5")
        assertEquals(0, set.contains("1"))
        assertEquals(1, set.contains("2"))
        assertEquals(2, set.contains("3"))
        assertEquals(3, set.contains("4"))
        assertEquals(-1, set.contains("5"))
        assertEquals(4, set.getSize())
    }

    @Test
    fun remove_doesNotHaveItem_doesNotRemoveItem() {
        val set = SetImpl()
        set.add("1")
        set.add("2")
        assertEquals(2, set.getSize())
        set.remove("a")
        assertEquals(0, set.contains("1"))
        assertEquals(1, set.contains("2"))
        assertEquals(2, set.getSize())
    }
    */
}