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
                    new AgedBrie().update(item);
                    continue;
                case "Backstage passes to a TAFKAL80ETC concert":
                    updateBackstagePass(item);
                    continue;
                case "Sulfuras, Hand of Ragnaros":
                    updateSulfuras(item);
                    continue;
                default:
                    updateCommonItem(item);
                    continue;
            }
        }
    }

    private void updateSulfuras(Item item) {

    }

    private void updateCommonItem(Item item) {
        item.quality = (item.sellIn > 0) ?
                (item.quality - 1) :
                (item.quality - 2);
        if (item.quality < 0) item.quality = 0;
        item.sellIn -= 1;
    }

    private void updateBackstagePass(Item item) {
        item.sellIn--;
        item.quality = (item.sellIn > 9) ? item.quality + 1 :
                (item.sellIn >= 5 ) ? item.quality + 2 :
                (item.sellIn >= 0 ) ? item.quality + 3 : 0;
        item.quality = item.quality > 50 ? 50 : item.quality;
    }

    private void updateAgedBrie(Item item) {
        item.sellIn--;
        item.quality = item.sellIn >= 0 ? item.quality + 1 : item.quality + 2;
        item.quality = item.quality > 50 ? 50 : item.quality;
    }

    private class AgedBrie {
        public void update(Item item) {
            updateAgedBrie(item);
        }
    }
}