package com.gildedrose;

class CommonItemUpdater extends ItemUpdater {

    public CommonItemUpdater() {
        super();
    }

    @Override
    void updateQuality() {
        item.quality = (item.sellIn > 0) ?
                (item.quality - 1) :
                (item.quality - 2);
    }

    @Override
    void checkQualityBounds() {
        item.quality = (item.quality < 0) ?
                item.quality = 0 :
                item.quality > 50 ? 50 : item.quality;
    }

    @Override
    void updateSellIn() {
        item.sellIn -= 1;
    }
}
