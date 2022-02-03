package com.gildedrose;

public class ConjuredItemUpdater extends CommonItemUpdater {

    public ConjuredItemUpdater() {
        super();
    }

    @Override
    void updateQuality(Item item) {
        item.quality -= 2;
    }
}
