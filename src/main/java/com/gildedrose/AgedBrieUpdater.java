package com.gildedrose;

class AgedBrieUpdater extends CommonItemUpdater {

    public AgedBrieUpdater() {
        super();
    }

    @Override
    void updateQuality(Item item) {
        this.item.quality = this.item.sellIn > 0 ? this.item.quality + 1 : this.item.quality + 2;
    }
}
