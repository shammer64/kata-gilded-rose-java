package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
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
                    item.quality = (item.sellIn > 0) ?
                            (item.quality - 1) :
                            (item.quality - 2);
                    if (item.quality < 0) item.quality = 0;
                    item.sellIn -= 1;
                    continue;
            }

//            if (!items[i].name.equals("Aged Brie")
//                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                if (items[i].quality > 0) {
//                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
//                        items[i].quality = items[i].quality - 1;
//                    }
//                }
//            } else {
//                if (items[i].quality < 50) {
//                    items[i].quality = items[i].quality + 1;
//
//                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                        if (items[i].sellIn < 11) {
//                            if (items[i].quality < 50) {
//                                items[i].quality = items[i].quality + 1;
//                            }
//                        }
//
//                        if (items[i].sellIn < 6) {
//                            if (items[i].quality < 50) {
//                                items[i].quality = items[i].quality + 1;
//                            }
//                        }
//                    }
//                }
//            }
//
//            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
//                items[i].sellIn = items[i].sellIn - 1;
//            }
//
//            if (items[i].sellIn < 0) {
//                if (!items[i].name.equals("Aged Brie")) {
//                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                        if (items[i].quality > 0) {
//                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
//                                items[i].quality = items[i].quality - 1;
//                            }
//                        }
//                    } else {
//                        items[i].quality = items[i].quality - items[i].quality;
//                    }
//                } else {
//                    if (items[i].quality < 50) {
//                        items[i].quality = items[i].quality + 1;
//                    }
//                }
//            }
        }
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