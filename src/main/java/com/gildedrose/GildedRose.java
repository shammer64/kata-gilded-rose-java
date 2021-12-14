package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            ItemUpdater itemUpdater = null;
            itemUpdater = getInstance(item);
            itemUpdater.update();
        }
    }

    private ItemUpdater getInstance(Item item) {
        ItemUpdater itemUpdater;
        switch (item.name) {
            case "Aged Brie":
                itemUpdater = new AgedBrieUpdater(item);
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                itemUpdater = new BackstagePassUpdater(item);
                break;
            case "Sulfuras, Hand of Ragnaros":
                itemUpdater = new SulfurasUpdater(item);
                break;
            default:
                itemUpdater = new CommonItemUpdater(item);
                break;
        }
        return itemUpdater;
    }

}