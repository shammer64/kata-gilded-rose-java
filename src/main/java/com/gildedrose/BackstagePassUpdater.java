package com.gildedrose;

class BackstagePassUpdater extends CommonItemUpdater {

    public BackstagePassUpdater() {
        super();
    }

    @Override
    void updateQuality(Item item) {
        this.item.quality = (this.item.sellIn > 10) ? this.item.quality + 1 :
                (this.item.sellIn > 5) ? this.item.quality + 2 :
                        (this.item.sellIn > 0) ? this.item.quality + 3 : 0;
    }
}
