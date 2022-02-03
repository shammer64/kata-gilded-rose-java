package com.gildedrose;

public abstract class ItemUpdater {
    protected Item item = null;

    public ItemUpdater() {
        super();
    }

    public Item update(Item item) {
        this.item = item;
        updateQuality(item);
        checkQualityBounds(item);
        updateSellIn(item);
        return this.item;
    }

    abstract void updateQuality(Item item);

    abstract void checkQualityBounds(Item item);

    abstract void updateSellIn(Item item);
}
