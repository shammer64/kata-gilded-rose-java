package com.gildedrose;

public abstract class ItemUpdater {
    protected Item item = null;

    public ItemUpdater() {
        super();
    }

    public Item update(Item item) {
        this.item = item;
        updateQuality();
        checkQualityBounds();
        updateSellIn();
        return this.item;
    }

    abstract void updateQuality();

    abstract void checkQualityBounds();

    abstract void updateSellIn();
}
