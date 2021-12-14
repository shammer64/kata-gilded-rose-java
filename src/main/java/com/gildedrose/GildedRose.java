package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            switch (item.name) {
                case "Aged Brie": 
                    handleAgedBrie(item);
                    continue;
                case "Backstage passes to a TAFKAL80ETC concert":
                    handleBackstagePass(item);
                    continue;
                case "Sulfuras, Hand of Ragnaros":
                    continue;
                default:
                    handleCommonItem(item);
                    continue;
            }
        }
    }

    private void handleCommonItem(Item item) {
        item.quality = (item.sellIn > 0) ?
                (item.quality - 1) :
                (item.quality - 2);
        if (item.quality < 0) item.quality = 0;
        item.sellIn -= 1;
    }

    private void handleBackstagePass(Item item) {
        item.sellIn--;
        item.quality = (item.sellIn > 9) ? item.quality + 1 :
                (item.sellIn >= 5 ) ? item.quality + 2 :
                (item.sellIn >= 0 ) ? item.quality + 3 : 0;
        item.quality = item.quality > 50 ? 50 : item.quality;
    }

    private void handleAgedBrie(Item item) {
        item.sellIn--;
        item.quality = item.sellIn >= 0 ? item.quality + 1 : item.quality + 2;
        item.quality = item.quality > 50 ? 50 : item.quality;
    }
}