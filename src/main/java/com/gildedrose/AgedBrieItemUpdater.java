package com.gildedrose;

class AgedBrieItemUpdater extends ItemUpdater {

    public AgedBrieItemUpdater() {
        super();
    }

    @Override
    void updateQuality(Item item) {
        item.quality = item.sellIn > 0 ? item.quality + 1 : item.quality + 2;
    }

}
