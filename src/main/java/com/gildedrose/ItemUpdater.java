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

    void checkQualityBounds(Item item) {
        item.quality = (item.quality < 0) ?
                item.quality = 0 :
                item.quality > 50 ? 50 : item.quality;
    }

    void updateSellIn(Item item) {
        item.sellIn -= 1;
    }
}
