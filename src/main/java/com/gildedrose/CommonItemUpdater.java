package com.gildedrose;

class CommonItemUpdater extends ItemUpdater {

    public CommonItemUpdater() {
        super();
    }

    @Override
    void updateQuality(Item item) {
        item.quality = (item.sellIn > 0) ?
                (item.quality - 1) :
                (item.quality - 2);
    }

}
