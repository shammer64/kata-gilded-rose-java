package com.gildedrose;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SulfurasUpdaterTest {

    @ParameterizedTest
    @CsvSource({"10,10,10", "0,10,0", "-10,10,-10"})
    void sulfurasNeverDecreaseSellInDate(int sellIn, int quality, int expected) {
        Item item = new Item("Sulfuras, Hand of Ragnaros", sellIn, quality);
        ItemUpdater itemUpdater = ItemUpdater.getInstance(item);

        itemUpdater.update();

        assertEquals(expected, item.sellIn);
    }

    @ParameterizedTest
    @CsvSource({"10,10,80", "0,10,80", "-10,10,80"})
    void sulfurasNeverDecreaseInQuality(int sellIn, int quality, int expected) {
        Item item = new Item("Sulfuras, Hand of Ragnaros", sellIn, quality);
        ItemUpdater itemUpdater = ItemUpdater.getInstance(item);

        itemUpdater.update();

        assertEquals(expected, item.quality);
    }

}