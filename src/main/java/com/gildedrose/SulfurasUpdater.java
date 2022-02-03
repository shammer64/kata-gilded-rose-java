package com.gildedrose;

class SulfurasUpdater extends CommonItemUpdater {

    public SulfurasUpdater(Item item) {
        super(item);
    }

    public SulfurasUpdater() {
        super();
    }

    @Override
    void updateQuality() {
        item.quality = 80;
    }

    @Override
    void checkQualityBounds() {
        item.quality += 0;
    }

    @Override
    void updateSellIn() {
        item.sellIn += 0;
    }
}
