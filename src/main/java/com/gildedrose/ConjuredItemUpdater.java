package com.gildedrose;

public class ConjuredItemUpdater extends ItemUpdater {

    public ConjuredItemUpdater() {
        super();
    }

    @Override
    void updateQuality(Item item) {
        item.quality -= 2;
    }

}
