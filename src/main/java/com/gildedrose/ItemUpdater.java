package com.gildedrose;

public abstract class ItemUpdater {
    protected Item item = null;

    public ItemUpdater() {
        super();
    }

    public Item update() {
        updateQuality();
        checkQualityBounds();
        updateSellIn();
        return item;
    }

    public Item update(Item item) {
        this.item = item;
        return update();
    }

    abstract void updateQuality();

    abstract void checkQualityBounds();

    abstract void updateSellIn();
}
