package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void shouldBeEqualForEqualNoOfGoods() {
        Item item1 = new Item(1, "book");
        Item item2 = new Item(1, "book");

        assertEquals(item1, item2);
    }

    @Test
    public void shouldBeEqualForEqualDescription() {
        Item item1 = new Item(1, "book at");
        Item item2 = new Item(1, "book at");

        assertEquals(item1, item2);
    }

    @Test
    public void shouldBeUnequalForUnequalDescriptions() {
        Item item1 = new Item(1, "book at");
        Item item2 = new Item(1, "book");

        assertNotEquals(item1, item2);
    }

    @Test
    public void shouldBeUnequalForUnequalNoOfGoods() {
        Item item1 = new Item(1, "book at");
        Item item2 = new Item(2, "book at");

        assertNotEquals(item1, item2);
    }

    @Test
    public void shouldHaveEqualHashCodesForEqualObjects() {
        Item item1 = new Item(1, "book at");
        Item item2 = new Item(1, "book at");

        assertEquals(item1.hashCode(), item2.hashCode());
    }
}