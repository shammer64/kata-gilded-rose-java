package com.gildedrose;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SulfurasUpdaterTest {

    @ParameterizedTest(name = "SellIn should never change")
    @CsvSource({"10,10,10", "0,10,0", "-10,10,-10"})
    void shouldNeverChangeSellInDate(int sellIn, int quality, int expected) {
        Item item = new Item("Sulfuras, Hand of Ragnaros", sellIn, quality);

        Item updatedItem = ItemUpdater.getInstance(item).update(item);

        assertEquals(expected, updatedItem.sellIn);
    }

    @ParameterizedTest(name = "Quality should never change")
    @CsvSource({"10,10,80", "0,10,80", "-10,10,80"})
    void shouldNeverChangeInQuality(int sellIn, int quality, int expected) {
        Item item = new Item("Sulfuras, Hand of Ragnaros", sellIn, quality);

        Item updatedItem = ItemUpdater.getInstance(item).update(item);

        assertEquals(expected, updatedItem.quality);
    }

}