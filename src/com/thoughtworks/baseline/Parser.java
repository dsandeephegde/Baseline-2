package com.thoughtworks.baseline;

public class Parser {

    private String input;

    Parser(String input) {
        this.input = input;
    }

    public Item parse() {
        String[] tokens = input.split(" ");
        String description = "";
        int numberOfGoods = 1;
        try {
            numberOfGoods = Integer.parseInt(tokens[0]);
        } catch (Exception e) {
            return new Item(1, "invalid");
        }
        try {
            for (int i = 1; i < tokens.length - 1; i++) {
                if(i == 1)
                    description += tokens[i];
                else
                    description += " " + tokens[i];
            }
        } catch (Exception e) {
            return new Item(1, "invalid");
        }
        return new Item(numberOfGoods, description);
    }
}
