package com.gildedrose;

public abstract class ItemUpdater {

    public ItemUpdater() {
        super();
    }

    public Item update(Item item) {
        updateQuality(item);
        checkQualityBounds(item);
        updateSellIn(item);
        return item;
    }

    abstract void updateQuality(Item item);

    abstract void checkQualityBounds(Item item);

    abstract void updateSellIn(Item item);
}
