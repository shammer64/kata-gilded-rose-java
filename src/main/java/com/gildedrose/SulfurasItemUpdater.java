package com.gildedrose;

class SulfurasItemUpdater extends ItemUpdater {

    public SulfurasItemUpdater() {
        super();
    }

    @Override
    void updateQuality(Item item) {
        item.quality = 80;
    }

    @Override
    void checkQualityBounds(Item item) {
        item.quality += 0;
    }

    @Override
    void updateSellIn(Item item) {
        item.sellIn += 0;
    }
}
