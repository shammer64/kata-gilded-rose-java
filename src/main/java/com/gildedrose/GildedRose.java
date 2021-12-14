package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            CommonItem itemUpdater = null;
            switch (item.name) {
                case "Aged Brie":
                    itemUpdater = new AgedBrie(item);
                    itemUpdater.update();
                    continue;
                case "Backstage passes to a TAFKAL80ETC concert":
                    itemUpdater = new BackstagePass(item);
                    itemUpdater.update();
                    continue;
                case "Sulfuras, Hand of Ragnaros":
                    new Sulfuras(item).update();
                    continue;
                default:
                    new CommonItem(item).update();
                    continue;
            }
        }
    }

}