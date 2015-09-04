package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void parseShouldReturnAItemObject() {
        Parser parser = new Parser("string");
        Item item = new Item(1, "invalid", 20.0, false);

        assertEquals(item.getClass(), parser.parse().getClass());
    }

    @Test
    public void parseShouldReturnNoOfGoods() {
        Parser parser = new Parser("1 book 20.9");
        Item item = new Item(1, "book", 20.0, false);

        assertEquals(item, parser.parse());
    }

    @Test
    public void parseShouldReturnDescriptionOtherThanNumbers() {
        Parser parser = new Parser("1 book at 20.0");
        Item item = new Item(1, "book at", 20.0, false);

        assertEquals(item, parser.parse());
    }

    @Test
    public void parseShouldReturnPrice() {
        Parser parser = new Parser("1 book at 20.0");
        Item item = new Item(1, "book at", 20.0, false);

        assertEquals(item, parser.parse());
    }

    @Test
    public void shouldReturnIsImportedOrNo() {
        Parser parser = new Parser("1 book at 20.0");
        Item item = new Item(1, "book at", 20.0, false);

        assertEquals(item, parser.parse());
    }
}