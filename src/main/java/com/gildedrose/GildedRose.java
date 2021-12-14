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
                    new AgedBrie(item).update();
                    continue;
                case "Backstage passes to a TAFKAL80ETC concert":
                    new BackstagePass(item).update();
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

    private class AgedBrie extends CommonItem {
      public AgedBrie(Item item) {
            super(item);
        }

        public void update() {
            item.quality = item.sellIn > 0 ? item.quality + 1 : item.quality + 2;
            checkQualityBounds();
            updateSellIn();
        }
    }

    private class BackstagePass extends CommonItem {

        public BackstagePass(Item item) {
            super(item);
        }

        @Override
        protected void updateQuality() {
            item.quality = (item.sellIn > 10) ? item.quality + 1 :
                    (item.sellIn > 5 ) ? item.quality + 2 :
                    (item.sellIn > 0 ) ? item.quality + 3 : 0;
        }
    }

    private class Sulfuras extends CommonItem {

        public Sulfuras(Item item) {
            super(item);
        }

        @Override
        protected void updateSellIn() {}

        public void update() {
            updateSellIn();
        }
    }

    private class CommonItem {
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
            item.quality =  (item.quality < 0) ?
                    item.quality = 0 :
                    item.quality > 50 ? 50 : item.quality;
        }

        void updateSellIn() {
            item.sellIn -= 1;
        }
    }
}