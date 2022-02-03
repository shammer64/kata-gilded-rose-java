package com.gildedrose;

class AgedBrieUpdater extends ItemUpdater {

    public AgedBrieUpdater() {
        super();
    }

    @Override
    void updateQuality(Item item) {
        item.quality = item.sellIn > 0 ? item.quality + 1 : item.quality + 2;
    }

}
