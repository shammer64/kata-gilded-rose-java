package com.gildedrose;

class CommonItemUpdater extends ItemUpdater {

    public CommonItemUpdater(Item item) {
        super(item);
    }

    @Override
    public ItemUpdater update() {
        updateQuality();
        checkQualityBounds();
        updateSellIn();
        return this;
    }

    void updateQuality() {
        item.quality = (item.sellIn > 0) ?
                (item.quality - 1) :
                (item.quality - 2);
    }

    void checkQualityBounds() {
        item.quality = (item.quality < 0) ?
                item.quality = 0 :
                item.quality > 50 ? 50 : item.quality;
    }

    void updateSellIn() {
        item.sellIn -= 1;
    }
}
