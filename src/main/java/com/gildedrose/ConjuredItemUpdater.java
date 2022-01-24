package com.gildedrose;

public class ConjuredItemUpdater extends CommonItemUpdater {
    public ConjuredItemUpdater(Item item) {
        super(item);
    }

    @Override
    protected void updateQuality() {
        item.quality -= 2;
    }
}
