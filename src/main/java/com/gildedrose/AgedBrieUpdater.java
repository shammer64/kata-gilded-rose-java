package com.gildedrose;

class AgedBrieUpdater extends CommonItemUpdater {
    public AgedBrieUpdater(Item item) {
        super(item);
    }

    public AgedBrieUpdater() {
        super();
    }

    @Override
    void updateQuality() {
        item.quality = item.sellIn > 0 ? item.quality + 1 : item.quality + 2;
    }
}
