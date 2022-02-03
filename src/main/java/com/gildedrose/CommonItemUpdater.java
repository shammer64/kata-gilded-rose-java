package com.gildedrose;

class CommonItemUpdater extends ItemUpdater {

    public CommonItemUpdater() {
        super();
    }

    @Override
    void updateQuality(Item item) {
        this.item.quality = (this.item.sellIn > 0) ?
                (this.item.quality - 1) :
                (this.item.quality - 2);
    }

    @Override
    void checkQualityBounds(Item item) {
        this.item.quality = (this.item.quality < 0) ?
                this.item.quality = 0 :
                this.item.quality > 50 ? 50 : this.item.quality;
    }

    @Override
    void updateSellIn(Item item) {
        this.item.sellIn -= 1;
    }
}
