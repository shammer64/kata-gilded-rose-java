package com.gildedrose;

class AgedBrie extends CommonItemUpdater {
    public AgedBrie(Item item) {
        super(item);
    }

    @Override
    void updateQuality() {
        item.quality = item.sellIn > 0 ? item.quality + 1 : item.quality + 2;
    }
}
