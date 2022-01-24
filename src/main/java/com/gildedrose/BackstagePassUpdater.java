package com.gildedrose;

class BackstagePassUpdater extends CommonItemUpdater {

    public BackstagePassUpdater(Item item) {
        super(item);
    }

    @Override
    protected void updateQuality() {
        item.quality = (item.sellIn > 10) ? item.quality + 1 :
                (item.sellIn > 5) ? item.quality + 2 :
                        (item.sellIn > 0) ? item.quality + 3 : 0;
    }
}
