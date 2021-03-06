package com.gildedrose;

class BackstagePassItemUpdater extends ItemUpdater {

    public BackstagePassItemUpdater() {
        super();
    }

    @Override
    void updateQuality(Item item) {
        item.quality = (item.sellIn > 10) ? item.quality + 1 :
                (item.sellIn > 5) ? item.quality + 2 :
                        (item.sellIn > 0) ? item.quality + 3 : 0;
    }

}
