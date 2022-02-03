package com.gildedrose;

class SulfurasUpdater extends ItemUpdater {

    public SulfurasUpdater() {
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
