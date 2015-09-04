package com.thoughtworks.baseline;

public class Parser {

    private String input;

    Parser(String input) {
        this.input = input;
    }

    public Item parse() {
        return new Item(1);
    }
}
