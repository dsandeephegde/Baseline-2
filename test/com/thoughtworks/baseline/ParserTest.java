package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void parseShouldReturnAItemObject() {
        Parser parser = new Parser("string");
        Item item = new Item();

        assertEquals(item.getClass(), parser.parse().getClass());
    }
}