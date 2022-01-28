package com.gildedrose;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

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
