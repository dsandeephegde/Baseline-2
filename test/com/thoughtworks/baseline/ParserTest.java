package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void parseShouldReturnAItemObject() {
        Parser parser = new Parser("string");
        Item item = new Item(1, "invalid");

        assertEquals(item.getClass(), parser.parse().getClass());
    }

    @Test
    public void parseShouldReturnNoOfGoods() {
        Parser parser = new Parser("1 book 20.9");
        Item item = new Item(1, "book");

        assertEquals(item, parser.parse());
    }

    @Test
    public void parseShouldReturnDescriptionOtherThanNumbers() {
        Parser parser = new Parser("1 book at 20.0");
        Item item = new Item(1, "book at");

        assertEquals(item, parser.parse());
    }
}