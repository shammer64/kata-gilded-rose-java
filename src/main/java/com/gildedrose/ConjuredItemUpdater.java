package com.gildedrose;

public class ConjuredItemUpdater extends CommonItemUpdater {

    public ConjuredItemUpdater() {
        super();
    }

    @Override
    void updateQuality() {
        item.quality -= 2;
    }
}
