package org.example;

import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class BoxTest {

    @Test
    void shouldBeEmptyWhenCreated() {
        Box<Integer> box = new Box<>();
        assertTrue(box.isEmpty());
    }

    @Test
    void shouldAddItem() {
        Box<String> box = new Box<>();
        box.put("A");
        assertFalse(box.isEmpty());
    }

    @Test
    void shouldReturnFirstItem() {
        Box<String> box = new Box<>();
        box.put("A");
        box.put("B");

        assertEquals("A", box.get());
    }

    @Test
    void shouldRemoveItemAfterGet() {
        Box<String> box = new Box<>();
        box.put("A");

        box.get();
        assertTrue(box.isEmpty());
    }

    @Test
    void shouldThrowExceptionWhenEmpty() {
        Box<String> box = new Box<>();
        assertThrows(NoSuchElementException.class, box::get);
    }

    @Test
    void shouldClearItems() {
        Box<String> box = new Box<>();
        box.put("A");

        box.clear();
        assertTrue(box.isEmpty());
    }
}
