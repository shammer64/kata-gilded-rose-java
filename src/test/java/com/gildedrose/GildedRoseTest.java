package com.gildedrose;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @ParameterizedTest
    @CsvSource({"2,1", "0,-1", "-2,-3"})
    void agedBrieDecreasesSellInByOne(int sellIn, int expected) {
        Item[] items = new Item[] { new Item("Aged Brie", sellIn, 1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(expected, app.items[0].sellIn);
    }

    @Test
    void agedBrieIncreasesQualityByOneOnOrBeforeToSellInDate() {
        Item[] items = new Item[] { new Item("Aged Brie", 2, 1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(2, app.items[0].quality);
    }

    @Test
    void agedBrieIncreasesQualityByTwoAfterSellInDate() {
        Item[] items = new Item[] { new Item("Aged Brie", -2, 5) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(7, app.items[0].quality);
    }

    @Test
    void agedBrieQualityShouldNeverExceed50() {
        Item[] items = new Item[] { new Item("Aged Brie", -2, 49) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, app.items[0].quality);
    }

    @Test
    void backstagePassDecreasesSellInByOne() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 15, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(14, app.items[0].sellIn);
    }

    @Test
    void backstagePassIncreasesQualityByOneUpTo10DaysBeforeSellInDate() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 15, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(11, app.items[0].quality);
    }

    @Test
    void backstagePassIncreasesQualityByTwoUpTo5DaysBeforeSellInDate() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 9, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(12, app.items[0].quality);
    }

    @Test
    void backstagePassQualityShouldNeverExceed50() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 15, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, app.items[0].quality);
    }

    @Test
    void backstagePassQualityShouldBeZeroAfterConcert() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }

    @Test
    void backstagePassIncreasesQualityByThreeUpToSellInDate() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 4, 35) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(38, app.items[0].quality);
    }

    @Test
    void sulfurasNeverDecreaseSellInDate() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 0, 80) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].sellIn);
    }

    @Test
    void sulfurasNeverDecreaseInQuality() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 0, 80) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(80, app.items[0].quality);
    }

}
