package com.gildedrose;

class CommonItem {
    protected final Item item;

    public CommonItem(Item item) {
        this.item = item;
    }

    public void update() {
        updateQuality();
        checkQualityBounds();
        updateSellIn();
    }

    void updateQuality() {
        item.quality = (item.sellIn > 0) ?
                (item.quality - 1) :
                (item.quality - 2);
    }

    void checkQualityBounds() {
        item.quality = (item.quality < 0) ?
                item.quality = 0 :
                item.quality > 50 ? 50 : item.quality;
    }

    void updateSellIn() {
        item.sellIn -= 1;
    }
}
