package com.gildedrose;

class CommonItemUpdater extends ItemUpdater {

    public CommonItemUpdater() {
        super();
    }

    @Override
    void updateQuality(Item item) {
        item.quality = (item.sellIn > 0) ?
                (item.quality - 1) :
                (item.quality - 2);
    }

    @Override
    void checkQualityBounds(Item item) {
        item.quality = (item.quality < 0) ?
                item.quality = 0 :
                item.quality > 50 ? 50 : item.quality;
    }

    @Override
    void updateSellIn(Item item) {
        item.sellIn -= 1;
    }
}
