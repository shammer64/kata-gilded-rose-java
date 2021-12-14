package com.gildedrose;

class BackstagePass extends CommonItem {

    public BackstagePass(Item item) {
        super(item);
    }

    @Override
    void updateQuality() {
        item.quality = (item.sellIn > 10) ? item.quality + 1 :
                (item.sellIn > 5) ? item.quality + 2 :
                        (item.sellIn > 0) ? item.quality + 3 : 0;
    }
}
