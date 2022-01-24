package com.gildedrose;

class SulfurasUpdater extends CommonItemUpdater {

    public SulfurasUpdater(Item item) {
        super(item);
    }

    @Override
    protected void updateQuality() {
        item.quality = 80;
    }

    @Override
    protected void checkQualityBounds() {
    }

    @Override
    protected void updateSellIn() {
    }
}
