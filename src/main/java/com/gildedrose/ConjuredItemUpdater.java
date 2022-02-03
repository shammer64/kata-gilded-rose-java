package com.gildedrose;

public class ConjuredItemUpdater extends CommonItemUpdater {

    public ConjuredItemUpdater() {
        super();
    }

    @Override
    void updateQuality(Item item) {
        this.item.quality -= 2;
    }
}
