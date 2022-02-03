package com.gildedrose;

class SulfurasUpdater extends CommonItemUpdater {

    public SulfurasUpdater() {
        super();
    }

    @Override
    void updateQuality(Item item) {
        this.item.quality = 80;
    }

    @Override
    void checkQualityBounds(Item item) {
        this.item.quality += 0;
    }

    @Override
    void updateSellIn(Item item) {
        this.item.sellIn += 0;
    }
}
