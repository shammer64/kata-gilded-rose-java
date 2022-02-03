package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        ItemUpdaterFactory itemUpdaterFactory = new ItemUpdaterFactory();
        for (Item item : items) {
            itemUpdaterFactory.getInstance(item.name).update(item);
        }
    }
}