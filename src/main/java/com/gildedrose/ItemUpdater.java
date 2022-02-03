package com.gildedrose;

public abstract class ItemUpdater {
    protected Item item = null;

    public ItemUpdater() {
        super();
    }

    public abstract Item update();

    public Item update(Item item) {
        this.item = item;
        return update();
    }
}
