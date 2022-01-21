package com.gildedrose;

class SulfurasUpdater extends CommonItemUpdater {

    public SulfurasUpdater(Item item) {
        super(item);
    }

    @Override
    void updateQuality() {
        item.quality = 80;
    }

    @Override
    void checkQualityBounds() {
    }

    @Override
    void updateSellIn() {
    }
}
