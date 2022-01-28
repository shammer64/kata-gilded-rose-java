package com.gildedrose;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @ParameterizedTest(name = "Aged Brie quality never exceeds 50")
    @CsvSource({"0,48,50", "-1,49,50", "-2,50,50"})
    void agedBrieQualityShouldNeverExceed50(int sellIn, int quality, int expected) {
        Item[] items = new Item[] { new Item("Aged Brie", sellIn, quality) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(expected, app.items[0].quality);
    }

    @ParameterizedTest(name = "Backstage Pass decreases sellIn by 1")
    @CsvSource({"2,1", "0,-1", "-2,-3"})
    void backstagePassDecreasesSellInByOne(int sellIn, int expected) {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(expected, app.items[0].sellIn);
    }

    @ParameterizedTest(name = "Backstage Pass increases quality by 1 up to 10 days prior to sellIn")
    @CsvSource({"13,4,5", "12,5,6", "11,6,7"})
    void backstagePassIncreasesQualityByOneUpTo10DaysBeforeSellInDate(int sellIn, int quality, int expected) {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, quality) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(expected, app.items[0].quality);
    }

    @ParameterizedTest(name = "Backstage Pass increases quality by 2 up to 5 days prior to sellIn")
    @CsvSource({"10,4,6", "7,12,14", "6,14,16"})
    void backstagePassIncreasesQualityByTwoUpTo5DaysBeforeSellInDate(int sellIn, int quality, int expected) {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, quality) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(expected, app.items[0].quality);
    }

    @ParameterizedTest(name = "Backstage Pass increases quality by 3 in last 5 days prior to sellIn")
    @CsvSource({"5,16,19", "2,25,28", "1,28,31"})
    void backstagePassIncreasesQualityByThreeUpToSellInDate(int sellIn, int quality, int expected) {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, quality) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(expected, app.items[0].quality);
    }

    @ParameterizedTest(name = "Backstage Pass quality never exceed 50")
    @CsvSource({"11,50,50", "6,49,50", "1,48,50"})
    void backstagePassQualityShouldNeverExceed50(int sellIn, int quality, int expected) {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, quality) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(expected, app.items[0].quality);
    }

    @ParameterizedTest(name = "Backstage Pass quality drops to 0 after concert")
    @CsvSource({"0,10", "-1,10", "-10,10"})
    void backstagePassQualityShouldBeZeroAfterConcert(int sellIn, int quality) {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, quality) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }

    @ParameterizedTest(name = "Common Items decrease sellIn by 1")
    @CsvSource({"1,10,0", "0,10,-1", "-1,10,-2"})
    void commonItemsShouldDecreaseSellInByOne(int sellIn, int quality, int expected) {
        Item[] items = new Item[] { new Item("Common Item", sellIn, quality) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(expected, app.items[0].sellIn);
    }

    @ParameterizedTest(name = "Common Items decrease quality by 1")
    @CsvSource({"3,10,9", "2,9,8", "1,8,7"})
    void commonItemsShouldDecreaseQualityByOneBeforeSellInDate(int sellIn, int quality, int expected) {
        Item[] items = new Item[] { new Item("Common Item", sellIn, quality) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(expected, app.items[0].quality);
    }

    @ParameterizedTest(name = "Common Items never decrease quality below 0")
    @CsvSource({"3,0,0", "0,0,0", "-1,1,0"})
    void commonItemsShouldNotDecreaseQualityBelowZero(int sellIn, int quality, int expected) {
        Item[] items = new Item[] { new Item("Common Item", sellIn, quality) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(expected, app.items[0].quality);
    }

}
