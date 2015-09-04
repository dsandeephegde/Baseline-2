package com.thoughtworks.baseline;

public class Parser {

    private String input;

    Parser(String input) {
        this.input = input;
    }

    public Item parse() {
        String[] tokens = input.split(" ");
        String description = "";
        double price = 0;
        boolean imported = false;
        int numberOfGoods = 1;
        try {
            numberOfGoods = Integer.parseInt(tokens[0]);
        } catch (Exception e) {
            return new Item(1, "invalid", 0.0, false);
        }
        try {
            for (int i = 1; i < tokens.length - 1; i++) {
                if(i == 1)
                    description += tokens[i];
                else
                    description += " " + tokens[i];
            }
        } catch (Exception e) {
            return new Item(1, "invalid", 0.0, false);
        }
        try {
            price = Double.parseDouble(tokens[tokens.length - 1]);
        } catch (Exception e) {
            return new Item(1, "invalid", 0.0, false);
        }
        try {
            for (int i = 1; i < tokens.length -1; i++) {
                if(tokens[i] == "imported")
                    imported = true;
            }
        } catch (Exception e) {
            return new Item(1, "invalid", 0.0, false);
        }
        return new Item(numberOfGoods, description, price, false);
    }
}
