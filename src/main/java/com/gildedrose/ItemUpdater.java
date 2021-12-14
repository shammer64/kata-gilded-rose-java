package com.gildedrose;

public abstract class ItemUpdater {
    final Item item;

    public ItemUpdater(Item item) {
        this.item = item;
    }

    public static ItemUpdater getInstance(Item item) {
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

    public abstract void update();
}
