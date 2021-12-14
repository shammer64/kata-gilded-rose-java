package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            CommonItemUpdater itemUpdater = null;
            switch (item.name) {
                case "Aged Brie":
                    itemUpdater = new AgedBrie(item);
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    itemUpdater = new BackstagePass(item);
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    itemUpdater = new Sulfuras(item);
                    break;
                default:
                    itemUpdater = new CommonItemUpdater(item);
                    break;
            }
            itemUpdater.update();
        }
    }

}