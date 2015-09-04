package com.thoughtworks.baseline;

import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void parseShouldReturnAItemObject() {
        Parser parser = new Parser("string");
        Item item = new Item(1);

        assertEquals(item.getClass(), parser.parse().getClass());
    }

    @Test
    public void parseShouldReturnNoOfGoods() {
        Parser parser = new Parser("1 book 20.9");
        Item item = new Item(1);

        assertEquals(item, parser.parse());
    }
}