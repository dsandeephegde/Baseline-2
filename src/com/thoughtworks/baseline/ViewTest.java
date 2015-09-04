package com.thoughtworks.baseline;

import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

public class ViewTest {

    @Test
    public void shouldAcceptString() {
        ByteArrayInputStream in = new ByteArrayInputStream("some string".getBytes());
        System.setIn(in);
        View view = new View();
        assertEquals("some string", view.input());
        System.setIn(System.in);
    }
}