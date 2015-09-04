package com.thoughtworks.baseline;

public class Item {

    private int numberOfGoods;
    private String description;

    public Item(int numberOfGoods, String description) {
        this.numberOfGoods = numberOfGoods;
        this.description = description;
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
}
