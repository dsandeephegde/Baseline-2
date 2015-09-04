package com.thoughtworks.baseline;

public class Item {

    private int numberOfGoods;
    private String description;
    private double price;
    private boolean isImported;

    public Item(int numberOfGoods, String description, double price, boolean isImported) {
        this.numberOfGoods = numberOfGoods;
        this.description = description;
        this.price = price;
        this.isImported = isImported;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        if (numberOfGoods != item.numberOfGoods) return false;
        return !(description != null ? !description.equals(item.description) : item.description != null);
    }

    @Override
    public int hashCode() {
        int result = numberOfGoods;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    public double salesTax() {
        return 2.0;
    }
}
